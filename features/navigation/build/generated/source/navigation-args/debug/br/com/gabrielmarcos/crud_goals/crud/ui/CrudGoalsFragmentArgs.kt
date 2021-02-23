package br.com.gabrielmarcos.crud_goals.crud.ui

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

data class CrudGoalsFragmentArgs(
  val goalId: Long
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("goal_id", this.goalId)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): CrudGoalsFragmentArgs {
      bundle.setClassLoader(CrudGoalsFragmentArgs::class.java.classLoader)
      val __goalId : Long
      if (bundle.containsKey("goal_id")) {
        __goalId = bundle.getLong("goal_id")
      } else {
        throw IllegalArgumentException("Required argument \"goal_id\" is missing and does not have an android:defaultValue")
      }
      return CrudGoalsFragmentArgs(__goalId)
    }
  }
}
