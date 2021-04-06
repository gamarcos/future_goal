package br.com.gabrielmarcos.pokedex.pokedexes.di

import androidx.lifecycle.MutableLiveData
import br.com.gabrielmarcos.core.data.cache.ICache
import br.com.gabrielmarcos.core.di.scopes.FeatureScope
import br.com.gabrielmarcos.pokedex.pokedexes.data.PokedexRepository
import br.com.gabrielmarcos.pokedex.pokedexes.domain.GetNextPokedexes
import br.com.gabrielmarcos.pokedex.pokedexes.domain.GetPokedexes
import br.com.gabrielmarcos.pokedex.pokedexes.domain.model.Pokedexes
import dagger.Module
import dagger.Provides

@Module(includes = [PokedexesRepositoryModule::class])
abstract class PokedexesModuleBuilder {

    companion object {

        @Provides
        @FeatureScope
        fun providesPokedexesLiveData(): MutableLiveData<Pokedexes> = MutableLiveData()

        @Provides
        @FeatureScope
        fun providesGetPokedexes(
            repository: PokedexRepository,
            liveData: MutableLiveData<Pokedexes>,
            cache: ICache
        ): GetPokedexes = GetPokedexes(repository, liveData, cache)

        @Provides
        @FeatureScope
        fun providesGetNextPokedexes(
            repository: PokedexRepository,
            liveData: MutableLiveData<Pokedexes>,
            cache: ICache
        ): GetNextPokedexes = GetNextPokedexes(repository, liveData, cache)
    }
}
