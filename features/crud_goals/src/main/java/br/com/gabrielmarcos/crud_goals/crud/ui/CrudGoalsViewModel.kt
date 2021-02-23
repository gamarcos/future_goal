package br.com.gabrielmarcos.crud_goals.crud.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.gabrielmarcos.core.database.GoalDatabaseRepository
import br.com.gabrielmarcos.core.model.Goal
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class CrudGoalsViewModel @Inject constructor(
    private val repository: GoalDatabaseRepository
): ViewModel() {

    val goalById: MutableLiveData<Goal?> = MutableLiveData()

    fun getGoalById(id: Long) {
        viewModelScope.launch(Dispatchers.IO) {
            val result = repository.getGoalById(id)
            goalById.postValue(result)
        }
    }

    fun updateGoalsByID(goal: Goal) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateGoalById(goal)
        }
    }

    fun insertGoal(goal: Goal) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertGoal(goal)
        }
    }
}