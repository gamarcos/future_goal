package br.com.gabrielmarcos.pokemon.pokemons.di

import br.com.gabrielmarcos.core.di.scopes.FeatureScope
import br.com.gabrielmarcos.pokemon.di.qualifier.PokemonsRetrofit
import br.com.gabrielmarcos.pokemon.pokemons.data.PokemonRepository
import br.com.gabrielmarcos.pokemon.pokemons.data.RemotePokemonRepository
import br.com.gabrielmarcos.pokemon.pokemons.data.datasource.PokemonsRemoteSource
import dagger.Binds
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
abstract class PokemonsRepositoryModule {

    @Binds
    abstract fun bindPokemonRepository(default: RemotePokemonRepository): PokemonRepository

    companion object {

        @Provides
        @FeatureScope
        fun providePokemonsSource(
            @PokemonsRetrofit retrofit: Retrofit
        ): PokemonsRemoteSource {
            return retrofit.create(PokemonsRemoteSource::class.java)
        }
    }
}
