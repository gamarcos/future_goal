package br.com.gabrielmarcos.pokedex.pokedexes.data

import br.com.gabrielmarcos.pokedex.pokedexes.data.datasource.PokedexesRemoteSource
import br.com.gabrielmarcos.pokedex.pokedexes.data.model.PokedexesResponse
import javax.inject.Inject

interface PokedexRepository {
    suspend fun getPokedexes(): PokedexesResponse
    suspend fun getPokedexesPage(url: String): PokedexesResponse
}

class RemotePokedexRepository @Inject constructor(
    private val dataSource: PokedexesRemoteSource
) : PokedexRepository {

    override suspend fun getPokedexes(): PokedexesResponse {
        val result = dataSource.getPokedexes()
        return result.takeIf {
            it.isSuccessful
        }?.body() ?: throw IllegalArgumentException("Failed to fetch pokedexes: ${result.code()}")
    }

    override suspend fun getPokedexesPage(url: String): PokedexesResponse {
        val result = dataSource.getPokedexesPage(url)
        return result.takeIf {
            it.isSuccessful
        }?.body() ?: throw IllegalArgumentException(
            "Failed to fetch pokedexes page: status code ${result.code()} from $url"
        )
    }
}
