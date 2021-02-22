package br.com.gabrielmarcos.core.database

import androidx.lifecycle.LiveData
import br.com.gabrielmarcos.core.model.Goal
import javax.inject.Inject

class GoalDatabaseRepository @Inject constructor(
    private val dao: GoalDAO
) {
    fun getAllGoals(): LiveData<List<Goal>> =
        dao.getAllGoals()

    suspend fun deleteAllGoals() = dao.deleteAllGoals()

    suspend fun deleteGoal(id: Long) = dao.deleteGoalByID(id)

    suspend fun insertGoal(goal: Goal) = dao.insertGoal(goal)
}