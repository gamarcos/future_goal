package br.com.gabrielmarcos.crud_goals.crud.ui

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class CrudGoalsFragmentArgs(
  val goalId: String
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("goal_id", this.goalId)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): CrudGoalsFragmentArgs {
      bundle.setClassLoader(CrudGoalsFragmentArgs::class.java.classLoader)
      val __goalId : String?
      if (bundle.containsKey("goal_id")) {
        __goalId = bundle.getString("goal_id")
        if (__goalId == null) {
          throw IllegalArgumentException("Argument \"goal_id\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"goal_id\" is missing and does not have an android:defaultValue")
      }
      return CrudGoalsFragmentArgs(__goalId)
    }
  }
}
