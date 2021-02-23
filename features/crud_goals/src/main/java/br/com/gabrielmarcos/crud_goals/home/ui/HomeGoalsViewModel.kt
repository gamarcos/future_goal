package br.com.gabrielmarcos.crud_goals.home.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.gabrielmarcos.core.database.GoalDatabaseRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class HomeGoalsViewModel @Inject constructor(private val repository: GoalDatabaseRepository) :
    ViewModel() {

    val goals = repository.getAllGoals()

//    fun deleteAll() {
//        viewModelScope.launch(Dispatchers.IO) {
//            repository.deleteAllGoals()
//        }
//    }
}