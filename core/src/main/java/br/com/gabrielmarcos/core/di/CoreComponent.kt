package br.com.gabrielmarcos.core.di

import android.content.Context
import br.com.gabrielmarcos.core.database.sample.GoalDAO
import br.com.gabrielmarcos.core.di.module.ContextModule
import br.com.gabrielmarcos.core.di.module.DatabaseModule
import br.com.gabrielmarcos.core.di.module.UtilsModule
import br.com.gabrielmarcos.core.utils.ThemeUtils
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [ContextModule::class,
        DatabaseModule::class,
        UtilsModule::class]
)
@Singleton
interface CoreComponent {

    fun context(): Context

    fun goalDAO(): GoalDAO

    fun themeUtils(): ThemeUtils
}