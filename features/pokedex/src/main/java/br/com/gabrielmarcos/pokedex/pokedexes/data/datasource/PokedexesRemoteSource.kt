package br.com.gabrielmarcos.pokedex.pokedexes.data.datasource

import br.com.gabrielmarcos.pokedex.pokedexes.data.model.PokedexesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface PokedexesRemoteSource {

    @GET("api/v2/pokedex/")
    suspend fun getPokedexes(): Response<PokedexesResponse>

    @GET
    suspend fun getPokedexesPage(@Url endpoint: String): Response<PokedexesResponse>
}
