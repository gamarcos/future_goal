package br.com.gabrielmarcos.pokemon.pokemons.di

import br.com.gabrielmarcos.core.data.cache.ICache
import br.com.gabrielmarcos.core.di.scopes.FeatureScope
import br.com.gabrielmarcos.pokemon.pokemons.PokemonsViewModel
import br.com.gabrielmarcos.pokemon.pokemons.data.PokemonRepository
import br.com.gabrielmarcos.pokemon.pokemons.domain.GetNextPokemons
import br.com.gabrielmarcos.pokemon.pokemons.domain.GetPokemons
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.Dispatchers

@Module(includes = [PokemonsRepositoryModule::class])
abstract class PokemonsModuleBuilder {

    companion object {
        @Provides
        @FeatureScope
        fun providesGetPokemons(
            repository: PokemonRepository,
            cache: ICache
        ): GetPokemons = GetPokemons(
            repository = repository,
            cache = cache,
            coroutineDispatcher = Dispatchers.IO
        )

        @Provides
        @FeatureScope
        fun providePokemonsViewModel(
            getPokemons: GetPokemons,
            getNextPokemons: GetNextPokemons
        ) = PokemonsViewModel(
            getPokemonsUseCase = getPokemons,
            getNextPokemonsUseCase = getNextPokemons
        )

        @Provides
        @FeatureScope
        fun providesGetNextPokemons(
            repository: PokemonRepository,
            cache: ICache
        ): GetNextPokemons = GetNextPokemons(
            repository = repository,
            cache = cache,
            coroutineDispatcher = Dispatchers.IO
        )
    }
}
