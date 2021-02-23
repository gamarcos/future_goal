package br.com.gabrielmarcos.crud_goals.home.ui

import android.os.Bundle
import androidx.navigation.NavDirections
import br.com.gabrielmarcos.navigation.R
import kotlin.Int
import kotlin.Long

class HomeGoalsFragmentDirections private constructor() {
  private data class ActionHomeToCrudGoal(
    val goalId: Long
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_home_to_crud_goal

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putLong("goal_id", this.goalId)
      return result
    }
  }

  companion object {
    fun actionHomeToCrudGoal(goalId: Long): NavDirections = ActionHomeToCrudGoal(goalId)
  }
}
