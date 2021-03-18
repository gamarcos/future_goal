package br.com.gabrielmarcos.core.di

import android.content.Context
import br.com.gabrielmarcos.core.database.GoalDAO
import br.com.gabrielmarcos.core.di.module.ContextModule
import br.com.gabrielmarcos.core.di.module.DatabaseModule
import br.com.gabrielmarcos.core.di.module.FirebaseModule
import br.com.gabrielmarcos.core.di.module.UtilsModule
import br.com.gabrielmarcos.core.network.repositories.GoalsFirebaseRepository
import br.com.gabrielmarcos.core.utils.ThemeUtils
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [ContextModule::class,
        DatabaseModule::class,
        UtilsModule::class,
        FirebaseModule::class]
)
@Singleton
interface CoreComponent {

    fun context(): Context

    fun goalDAO(): GoalDAO

    fun themeUtils(): ThemeUtils

    fun goalsRemoteRepository(): GoalsFirebaseRepository
}