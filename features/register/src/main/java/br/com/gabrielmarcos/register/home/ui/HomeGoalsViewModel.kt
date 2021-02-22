package br.com.gabrielmarcos.register.home.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.gabrielmarcos.core.database.GoalDatabaseRepository
import br.com.gabrielmarcos.core.model.Goal
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class HomeGoalsViewModel @Inject constructor(
    private val repository: GoalDatabaseRepository
): ViewModel() {

    val goals = repository.getAllGoals()

    fun insertGoals(goals: Goal) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertGoal(goals)
        }
    }

    fun deleteAllGoals() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteAllGoals()
        }
    }
}