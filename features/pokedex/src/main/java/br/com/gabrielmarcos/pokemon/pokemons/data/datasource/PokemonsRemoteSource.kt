package br.com.gabrielmarcos.pokemon.pokemons.data.datasource

import br.com.gabrielmarcos.pokemon.pokemons.data.model.PokemonsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface PokemonsRemoteSource {

    @GET("api/v2/pokemon/")
    suspend fun getPokemons(): Response<PokemonsResponse>

    @GET
    suspend fun getPokemonsPage(@Url endpoint: String): Response<PokemonsResponse>
}

//TODO:: ROBAR FOTO DAQ
//https://assets.pokemon.com/assets/cms2/img/pokedex/full/898.png