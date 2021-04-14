package br.com.gabrielmarcos.pokemon.pokemons.data

import br.com.gabrielmarcos.pokemon.pokemons.data.datasource.PokemonsRemoteSource
import br.com.gabrielmarcos.pokemon.pokemons.data.model.PokemonsResponse
import javax.inject.Inject

interface PokemonRepository {
    suspend fun getPokemons(): PokemonsResponse
    suspend fun getPokemonsPage(url: String): PokemonsResponse
}

class RemotePokemonRepository @Inject constructor(
    private val dataSource: PokemonsRemoteSource
) : PokemonRepository {

    override suspend fun getPokemons(): PokemonsResponse {
        val result = dataSource.getPokemons()
        return result.takeIf {
            it.isSuccessful
        }?.body() ?: throw IllegalArgumentException("Failed to fetch pokedexes: ${result.code()}")
    }

    override suspend fun getPokemonsPage(url: String): PokemonsResponse {
        val result = dataSource.getPokemonsPage(url)
        return result.takeIf {
            it.isSuccessful
        }?.body() ?: throw IllegalArgumentException(
            "Failed to fetch pokedexes page: status code ${result.code()} from $url"
        )
    }
}
