package br.com.gabrielmarcos.core.database

import androidx.lifecycle.LiveData
import br.com.gabrielmarcos.core.model.Goal
import javax.inject.Inject

class GoalDatabaseRepository @Inject constructor(
    private val dao: GoalDAO
) {
    fun getAllGoals(): LiveData<List<Goal>> =
        dao.getAllGoals()

    suspend fun getGoalById(id: String): Goal? =
        dao.getGoalByID(id)

    suspend fun deleteAllGoals() = dao.deleteAllGoals()

    suspend fun deleteGoal(id: String) = dao.deleteGoalByID(id)

    suspend fun insertGoal(goal: Goal) = dao.insertGoal(goal)

    suspend fun updateGoalById(goal: Goal) = dao.updateGoalById(goal)
}