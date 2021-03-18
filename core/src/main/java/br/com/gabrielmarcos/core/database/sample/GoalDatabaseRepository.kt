package br.com.gabrielmarcos.core.database.sample

import androidx.lifecycle.LiveData
import br.com.gabrielmarcos.core.model.Goal
import javax.inject.Inject

class GoalDatabaseRepository @Inject constructor(
    private val dao: GoalDAO
) {
    fun getAllGoals(): LiveData<List<Goal>> =
        dao.getAllGoals()

    suspend fun getGoalById(id: Long): Goal? =
        dao.getGoalByID(id)

    suspend fun deleteAllGoals() = dao.deleteAllGoals()

    suspend fun deleteGoal(id: Long) = dao.deleteGoalByID(id)

    suspend fun insertGoal(goal: Goal) = dao.insertGoal(goal)

    suspend fun updateGoalById(goal: Goal) = dao.updateGoalById(goal)
}