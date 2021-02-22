package br.com.gabrielmarcos.register.insert.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.gabrielmarcos.core.database.GoalDatabaseRepository
import br.com.gabrielmarcos.core.model.Goal
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class InsertGoalsViewModel @Inject constructor(
    private val repository: GoalDatabaseRepository
): ViewModel() {
    fun insertGoal(goal: Goal) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertGoal(goal)
        }
    }
}