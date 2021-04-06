package br.com.gabrielmarcos.pokedex.pokedexes.di

import br.com.gabrielmarcos.core.di.scopes.FeatureScope
import br.com.gabrielmarcos.pokedex.di.qualifier.PokedexRetrofit
import br.com.gabrielmarcos.pokedex.pokedexes.data.PokedexRepository
import br.com.gabrielmarcos.pokedex.pokedexes.data.RemotePokedexRepository
import br.com.gabrielmarcos.pokedex.pokedexes.data.datasource.PokedexesRemoteSource
import dagger.Binds
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
abstract class PokedexesRepositoryModule {

    @Binds
    abstract fun bindPokedexRepository(default: RemotePokedexRepository): PokedexRepository

    companion object {

        @Provides
        @FeatureScope
        fun providePokedexSource(
            @PokedexRetrofit retrofit: Retrofit
        ): PokedexesRemoteSource {
            return retrofit.create(PokedexesRemoteSource::class.java)
        }
    }
}
