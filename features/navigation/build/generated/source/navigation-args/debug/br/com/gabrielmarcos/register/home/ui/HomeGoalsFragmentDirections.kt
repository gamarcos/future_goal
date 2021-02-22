package br.com.gabrielmarcos.register.home.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import br.com.gabrielmarcos.navigation.R

class HomeGoalsFragmentDirections private constructor() {
  companion object {
    fun actionHomeToInsertGoal(): NavDirections =
        ActionOnlyNavDirections(R.id.action_home_to_insert_goal)
  }
}
