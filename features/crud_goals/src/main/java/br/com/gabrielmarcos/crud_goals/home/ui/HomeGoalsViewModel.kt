package br.com.gabrielmarcos.crud_goals.home.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.gabrielmarcos.core.database.GoalDatabaseRepository
import br.com.gabrielmarcos.core.network.repositories.GoalsFirebaseRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class HomeGoalsViewModel @Inject constructor(
    val repository: GoalDatabaseRepository,
    val firebaseRepository: GoalsFirebaseRepository
) : ViewModel() {
//    init { firebaseRepository.createAnonymouslyFirebaseAccount() }

//    val goals = MutableLiveData<>

    val goals = repository.getAllGoals()

    fun getGoals(id: String) {
        viewModelScope.launch(Dispatchers.IO) {
            firebaseRepository.getGoalDatabase()
        }
    }
}