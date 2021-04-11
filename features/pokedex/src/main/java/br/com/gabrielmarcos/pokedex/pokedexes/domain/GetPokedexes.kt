package br.com.gabrielmarcos.pokedex.pokedexes.domain

import br.com.gabrielmarcos.core.data.cache.ICache
import br.com.gabrielmarcos.core.usecase.UseCase
import br.com.gabrielmarcos.pokedex.pokedexes.data.PokedexRepository
import br.com.gabrielmarcos.pokedex.pokedexes.data.model.PokedexResponse
import br.com.gabrielmarcos.pokedex.pokedexes.domain.mapper.mapToPokedexesNavigation
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.SendChannel
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

internal const val POKEDEXES_NAVIGATION = "pokedexes_navigation"

class GetPokedexes @Inject constructor(
    private val repository: PokedexRepository,
    private val cache: ICache,
    private val coroutineDispatcher: CoroutineDispatcher
) : UseCase<String, List<PokedexResponse>?>(coroutineDispatcher) {

    override suspend fun run(channel: SendChannel<List<PokedexResponse>?>, params: String?) {
        val result = repository.getPokedexes()
        val navigation = result.mapToPokedexesNavigation()
        cache.put(POKEDEXES_NAVIGATION, navigation)
        channel.send(result.results)
        channel.close()
    }

    override suspend fun onError(throwable: Throwable) {
        super.onError(throwable)
    }
}