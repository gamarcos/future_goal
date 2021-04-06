package br.com.gabrielmarcos.pokedex.pokedexes.domain

import androidx.lifecycle.MutableLiveData
import br.com.gabrielmarcos.core.data.cache.ICache
import br.com.gabrielmarcos.core.usecase.UseCase
import br.com.gabrielmarcos.pokedex.pokedexes.data.PokedexRepository
import br.com.gabrielmarcos.pokedex.pokedexes.domain.mapper.mapToPokedexes
import br.com.gabrielmarcos.pokedex.pokedexes.domain.mapper.mapToPokedexesNavigation
import br.com.gabrielmarcos.pokedex.pokedexes.domain.model.Pokedexes
import br.com.gabrielmarcos.pokedex.pokedexes.domain.model.PokedexesNavigation
import javax.inject.Inject

class GetNextPokedexes @Inject constructor(
    private val repository: PokedexRepository,
    private val liveData: MutableLiveData<Pokedexes>,
    private val cache: ICache
) : UseCase<String>() {

    override suspend fun run(input: String) {
        cache.get<PokedexesNavigation>(POKEDEXES_NAVIGATION)?.next?.takeIf {
            it.isNotBlank()
        }?.let { nextPage ->
            val result = repository.getPokedexesPage(nextPage)
            val navigation = result.mapToPokedexesNavigation()
            cache.put(POKEDEXES_NAVIGATION, navigation)
            liveData.postValue(result.mapToPokedexes())
        }
    }
}
