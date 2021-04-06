package br.com.gabrielmarcos.pokedex.di.modules

import android.content.Context
import br.com.gabrielmarcos.core.di.scopes.FeatureScope
import br.com.gabrielmarcos.pokedex.R
import br.com.gabrielmarcos.pokedex.di.qualifier.PokedexRetrofit
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

private const val TIME_OUT_READ = 30L
private const val TIME_OUT_CONNECTION = 30L

@Module
class PokedexNetworkModule {

    @Provides
    @FeatureScope
    @PokedexRetrofit
    fun providesRetrofit(
        context: Context
    ): Retrofit {
        val baseUrl = context.resources.getString(R.string.pokeapi)

        val httpClientBuilder = OkHttpClient.Builder()

        httpClientBuilder
            .readTimeout(TIME_OUT_READ, TimeUnit.SECONDS)
            .connectTimeout(TIME_OUT_CONNECTION, TimeUnit.SECONDS)
            .addInterceptor(
                HttpLoggingInterceptor().apply {
                    this.level = HttpLoggingInterceptor.Level.BODY
                }
            )

        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClientBuilder.build())
            .build()
    }
}
