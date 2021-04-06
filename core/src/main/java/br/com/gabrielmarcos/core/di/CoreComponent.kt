package br.com.gabrielmarcos.core.di

import android.content.Context
import br.com.gabrielmarcos.core.data.cache.ICache
import br.com.gabrielmarcos.core.di.module.ContextModule
import br.com.gabrielmarcos.core.di.module.UtilsModule
import br.com.gabrielmarcos.core.utils.ThemeUtils
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        ContextModule::class,
        UtilsModule::class
    ]
)
@Singleton
interface CoreComponent {

    fun context(): Context

    fun themeUtils(): ThemeUtils

    fun cache(): ICache
}