package br.com.gabrielmarcos.pokedex.pokedexes.di

import br.com.gabrielmarcos.core.data.cache.ICache
import br.com.gabrielmarcos.core.di.scopes.FeatureScope
import br.com.gabrielmarcos.pokedex.pokedexes.PokedexesViewModel
import br.com.gabrielmarcos.pokedex.pokedexes.data.PokedexRepository
import br.com.gabrielmarcos.pokedex.pokedexes.domain.GetNextPokedexes
import br.com.gabrielmarcos.pokedex.pokedexes.domain.GetPokedexes
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.Dispatchers

@Module(includes = [PokedexesRepositoryModule::class])
abstract class PokedexesModuleBuilder {

    companion object {
        @Provides
        @FeatureScope
        fun providesGetPokedexes(
            repository: PokedexRepository,
            cache: ICache
        ): GetPokedexes = GetPokedexes(
            repository = repository,
            cache = cache,
            coroutineDispatcher = Dispatchers.IO
        )

        @Provides
        @FeatureScope
        fun providePokedexesViewModel(
            getPokedexes: GetPokedexes,
            getNextPokedexes: GetNextPokedexes
        ) = PokedexesViewModel(
            getPokedexesUseCase = getPokedexes,
            getNextPokedexesUseCase = getNextPokedexes
        )

        @Provides
        @FeatureScope
        fun providesGetNextPokedexes(
            repository: PokedexRepository,
            cache: ICache
        ): GetNextPokedexes = GetNextPokedexes(
            repository = repository,
            cache = cache,
            coroutineDispatcher = Dispatchers.IO
        )
    }
}
