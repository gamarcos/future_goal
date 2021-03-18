package br.com.gabrielmarcos.core.network.repositories

import android.util.Log
import androidx.lifecycle.LiveData
import br.com.gabrielmarcos.core.model.Goal
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.getValue

private const val MAIN_REFERENCE = "users"

class GoalsFirebaseRepository(
    private val firebaseDatabase: FirebaseDatabase,
    private val firebaseAuth: FirebaseAuth
) {

    fun createAnonymouslyFirebaseAccount() {
        firebaseAuth.currentUser?.run {
            firebaseAuth.signInAnonymously().addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Log.d(GoalsFirebaseRepository::class.simpleName, "signInAnonymously:success")
                } else {
                    Log.w(GoalsFirebaseRepository::class.simpleName, "signInAnonymously:failure", task.exception)
                }
            }
        }
    }

    fun saveGoalDatabase(goal: Goal) {
        firebaseAuth.currentUser?.run {
            firebaseDatabase.getReference(MAIN_REFERENCE)
                .child(uid)
                .child(goal.id)
                .setValue(goal)
                .addOnSuccessListener {
                    Log.d(GoalsFirebaseRepository::class.simpleName, "insertDatabase:success")
                }
                .addOnFailureListener {
                    Log.w(GoalsFirebaseRepository::class.simpleName, "insertDatabase:failure", it)
                }
        }
    }

    fun getGoalDatabase() {
        val uid = firebaseAuth.currentUser?.run { uid }
        val reference = firebaseDatabase.getReference("${MAIN_REFERENCE}/${uid}")
        val postListener = object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val goals = snapshot.getValue<HashMap<String, Goal>>()
            }

            override fun onCancelled(error: DatabaseError) {
                Log.w(GoalsFirebaseRepository::class.simpleName, "getGoalDatabase:onCancelled", error.toException())
            }
        }
        reference.addValueEventListener(postListener)
    }

    fun getGoalByIdDatabase(id: String) {
        val uid = firebaseAuth.currentUser?.run { uid }
        val reference = firebaseDatabase.getReference("${MAIN_REFERENCE}/${uid}/${id}")
        val postListener = object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val goals = snapshot.getValue<Goal>()
            }

            override fun onCancelled(error: DatabaseError) {
                Log.w(GoalsFirebaseRepository::class.simpleName, "getGoalByIdDatabase:onCancelled", error.toException())
            }
        }
        reference.addValueEventListener(postListener)
    }
}