package br.com.gabrielmarcos.futuregoals

import android.content.Context
import br.com.gabrielmarcos.core.di.CoreComponent
import br.com.gabrielmarcos.core.di.DaggerCoreComponent
import br.com.gabrielmarcos.core.di.module.ContextModule
import br.com.gabrielmarcos.core.utils.ThemeUtils
import br.com.gabrielmarcos.futuregoals.di.DaggerAppComponent
import com.google.android.play.core.splitcompat.SplitCompatApplication
import javax.inject.Inject
import kotlin.random.Random

class GoalApplication: SplitCompatApplication() {

    lateinit var coreComponent: CoreComponent

    @Inject
    lateinit var themeUtils: ThemeUtils

    companion object {
        @JvmStatic
        fun coreComponent(context: Context) =
            (context.applicationContext as? GoalApplication)?.coreComponent
    }

    override fun onCreate() {
        super.onCreate()
        initCoreDependencyInjection()
        initAppDependencyInjection()
        initRandomNightMode()
    }

    /**
     * Initialize app dependency injection component.
     */
    private fun initAppDependencyInjection() {
        DaggerAppComponent
            .builder()
            .coreComponent(coreComponent)
            .build()
            .inject(this)
    }

    /**
     * Initialize core dependency injection component.
     */
    private fun initCoreDependencyInjection() {
        coreComponent = DaggerCoreComponent
            .builder()
            .contextModule(ContextModule(this))
            .build()
    }

    private fun initRandomNightMode() {
        if (BuildConfig.DEBUG) {
            themeUtils.setNightMode(false)
        }
    }
}