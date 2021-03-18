package br.com.gabrielmarcos.crud_goals.home.ui

import android.os.Bundle
import androidx.navigation.NavDirections
import br.com.gabrielmarcos.navigation.R
import kotlin.Int
import kotlin.String

class HomeGoalsFragmentDirections private constructor() {
  private data class ActionHomeToCrudGoal(
    val goalId: String
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_home_to_crud_goal

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("goal_id", this.goalId)
      return result
    }
  }

  companion object {
    fun actionHomeToCrudGoal(goalId: String): NavDirections = ActionHomeToCrudGoal(goalId)
  }
}
