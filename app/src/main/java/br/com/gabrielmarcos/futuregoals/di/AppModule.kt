package br.com.gabrielmarcos.futuregoals.di

import android.content.Context
import br.com.gabrielmarcos.futuregoals.GoalApplication
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideContext(application: GoalApplication): Context = application.applicationContext
}
