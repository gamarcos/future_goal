package br.com.gabrielmarcos.core.database

import androidx.lifecycle.LiveData
import androidx.room.*
import br.com.gabrielmarcos.core.model.Goal

@Dao
interface GoalDAO {
    @Query("SELECT * FROM future_goal")
    fun getAllGoals(): LiveData<List<Goal>>

    @Query("SELECT * FROM future_goal WHERE id = :id")
    suspend fun getGoalByID(id: Long): Goal?

    @Query("DELETE FROM future_goal")
    suspend fun deleteAllGoals()

    @Query("DELETE FROM future_goal WHERE id = :id")
    suspend fun deleteGoalByID(id: Long)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertGoal(goal: Goal)

    @Update
    suspend fun updateGoalById(goal: Goal)
}