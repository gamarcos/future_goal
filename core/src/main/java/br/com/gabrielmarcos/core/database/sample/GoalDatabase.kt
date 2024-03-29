package br.com.gabrielmarcos.core.database.sample

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.gabrielmarcos.core.model.Goal


@Database(
    entities = [Goal::class],
    exportSchema = false,
    version = 3
)
abstract class GoalDatabase: RoomDatabase() {

    abstract fun goalDAO(): GoalDAO

}