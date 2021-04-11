package br.com.gabrielmarcos.pokedex.pokedexes.domain

import br.com.gabrielmarcos.core.data.cache.ICache
import br.com.gabrielmarcos.core.usecase.UseCase
import br.com.gabrielmarcos.pokedex.pokedexes.data.PokedexRepository
import br.com.gabrielmarcos.pokedex.pokedexes.data.model.PokedexResponse
import br.com.gabrielmarcos.pokedex.pokedexes.domain.mapper.mapToPokedexesNavigation
import br.com.gabrielmarcos.pokedex.pokedexes.domain.model.PokedexesNavigation
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.SendChannel
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

class GetNextPokedexes @Inject constructor(
    private val repository: PokedexRepository,
    private val cache: ICache,
    private val coroutineDispatcher: CoroutineDispatcher
) : UseCase<Unit, List<PokedexResponse>?>(coroutineDispatcher) {

    override suspend fun run(channel: SendChannel<List<PokedexResponse>?>, params: Unit?) {
        cache.get<PokedexesNavigation>(POKEDEXES_NAVIGATION)?.next?.takeIf {
            it.isNotBlank()
        }?.let { nextPage ->
            val result = repository.getPokedexesPage(nextPage)
            val navigation = result.mapToPokedexesNavigation()
            cache.put(POKEDEXES_NAVIGATION, navigation)
            channel.send(result.results)
            channel.close()
        }
    }
}
