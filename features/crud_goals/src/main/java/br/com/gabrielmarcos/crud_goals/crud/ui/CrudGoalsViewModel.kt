package br.com.gabrielmarcos.crud_goals.crud.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.gabrielmarcos.core.database.GoalDatabaseRepository
import br.com.gabrielmarcos.core.model.Goal
import br.com.gabrielmarcos.core.network.repositories.GoalsFirebaseRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

//TODO:: Create interactor
class CrudGoalsViewModel @Inject constructor(
    private val repository: GoalDatabaseRepository,
    private val firebaseRepository: GoalsFirebaseRepository
): ViewModel() {
    val goalById: MutableLiveData<Goal?> = MutableLiveData()

    fun getGoalById(id: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val result = repository.getGoalById(id)
            goalById.postValue(result)
//            firebaseRepository.getGoalByIdDatabase(id)
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
//            firebaseRepository.saveGoalDatabase(goal)
        }
    }

    fun deleteGoalById(id: String) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteGoal(id)
        }
    }
}