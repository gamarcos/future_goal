package br.com.gabrielmarcos.core.di.module

import android.content.Context
import androidx.room.Room
import br.com.gabrielmarcos.core.database.sample.GoalDAO
import br.com.gabrielmarcos.core.database.sample.GoalDatabase
import br.com.gabrielmarcos.core.database.sample.GoalDatabaseRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideGoalDatabase(context: Context) =
        Room.databaseBuilder(
            context,
            GoalDatabase::class.java,
            "future-goals-db"
        ).fallbackToDestructiveMigration()
            .build()

    @Singleton
    @Provides
    fun provideGoalDao(goalDataBase: GoalDatabase) =
        goalDataBase.goalDAO()


    @Singleton
    @Provides
    fun provideGoalDatabaseRepository(dao: GoalDAO) = GoalDatabaseRepository(dao)
}