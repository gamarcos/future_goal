package br.com.gabrielmarcos.pokemon.pokemons.domain

import br.com.gabrielmarcos.core.data.cache.ICache
import br.com.gabrielmarcos.core.usecase.UseCase
import br.com.gabrielmarcos.pokemon.pokemons.data.PokemonRepository
import br.com.gabrielmarcos.pokemon.pokemons.data.model.PokemonResponse
import br.com.gabrielmarcos.pokemon.pokemons.domain.mapper.mapToPokemonsNavigation
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.channels.SendChannel
import javax.inject.Inject

internal const val POKEDEXES_NAVIGATION = "pokedexes_navigation"

class GetPokemons @Inject constructor(
    private val repository: PokemonRepository,
    private val cache: ICache,
    private val coroutineDispatcher: CoroutineDispatcher
) : UseCase<String, List<PokemonResponse>?>(coroutineDispatcher) {

    override suspend fun run(channel: SendChannel<List<PokemonResponse>?>, params: String?) {
        val result = repository.getPokemons()
        val navigation = result.mapToPokemonsNavigation()
        cache.put(POKEDEXES_NAVIGATION, navigation)
        channel.send(result.results)
        channel.close()
    }

    override suspend fun onError(throwable: Throwable) {
        super.onError(throwable)
    }
}