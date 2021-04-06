package br.com.gabrielmarcos.pokedex.pokedexes.domain

import androidx.lifecycle.MutableLiveData
import br.com.gabrielmarcos.core.data.cache.ICache
import br.com.gabrielmarcos.core.usecase.UseCase
import br.com.gabrielmarcos.pokedex.pokedexes.data.PokedexRepository
import br.com.gabrielmarcos.pokedex.pokedexes.domain.mapper.mapToPokedexes
import br.com.gabrielmarcos.pokedex.pokedexes.domain.mapper.mapToPokedexesNavigation
import br.com.gabrielmarcos.pokedex.pokedexes.domain.model.Pokedexes
import javax.inject.Inject

internal const val POKEDEXES_NAVIGATION = "pokedexes_navigation"

class GetPokedexes @Inject constructor(
    private val repository: PokedexRepository,
    private val liveData: MutableLiveData<Pokedexes>,
    private val cache: ICache
) : UseCase<String>() {

    override suspend fun run(input: String) {
        val result = repository.getPokedexes()
        val navigation = result.mapToPokedexesNavigation()
        cache.put(POKEDEXES_NAVIGATION, navigation)
        liveData.postValue(result.mapToPokedexes())
    }
}
