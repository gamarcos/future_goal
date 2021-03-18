package br.com.gabrielmarcos.crud_goals.crud.ui

import android.app.DatePickerDialog
import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import br.com.gabrielmarcos.core.extensions.getInstantDate
import br.com.gabrielmarcos.core.extensions.instantToStringDate
import br.com.gabrielmarcos.core.extensions.observe
import br.com.gabrielmarcos.core.extensions.stringToInstant
import br.com.gabrielmarcos.core.model.Goal
import br.com.gabrielmarcos.core.model.Status
import br.com.gabrielmarcos.crud_goals.R
import br.com.gabrielmarcos.crud_goals.crud.di.CrudGoalsModule
import br.com.gabrielmarcos.crud_goals.crud.di.DaggerCrudGoalsComponent
import br.com.gabrielmarcos.futuregoals.GoalApplication
import com.google.android.material.textfield.TextInputEditText
import java.util.*
import javax.inject.Inject

class CrudGoalsFragment : Fragment() {

    @Inject
    lateinit var viewModel: CrudGoalsViewModel

    private lateinit var adapter: ArrayAdapter<String>

    private val goalTitle
        get() = requireActivity().findViewById<TextInputEditText>(R.id.insert_goal_title)

    private val goalDescription
        get() = requireActivity().findViewById<TextInputEditText>(R.id.insert_goal_description)

    private val goalStatus
        get() = requireActivity().findViewById<AutoCompleteTextView>(R.id.insert_spinner_status)

    private val goalEndTime
        get() = requireActivity().findViewById<TextInputEditText>(R.id.insert_goal_finish_date)

    private val saveGoal
        get() = requireActivity().findViewById<Button>(R.id.insert_goals_save_button)

    private val deleteGoal
        get() = requireActivity().findViewById<Button>(R.id.insert_goals_delete_button)

    private lateinit var selectedEndGoal: String

    private val status = Status.values().map { it.name }

    private var needUpdateGoal = false
    private var initialDate: String? = null

    private val args: CrudGoalsFragmentArgs by navArgs()

    override fun onAttach(context: Context) {
        super.onAttach(context)
        DaggerCrudGoalsComponent
            .builder()
            .coreComponent(GoalApplication.coreComponent(requireContext()))
            .crudGoalsModule(CrudGoalsModule(this))
            .build()
            .inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_insert_goals,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        handleLoadingView()

        setupObserver()
        setupOnClick()
        setupSpinner()
        setupDatePicker()
    }

    private fun handleLoadingView() {
        needUpdateGoal = (args.goalId.isNotEmpty()).also {
            if (it) viewModel.getGoalById(args.goalId)
        }
    }

    private fun setupObserver() {
        observe(viewModel.goalById) {
            it?.run { updateValuesOnFields(this) }
        }
    }

    private fun updateValuesOnFields(goal: Goal) {
        deleteGoal.visibility = View.VISIBLE
        goalTitle.setText(goal.title)
        goalDescription.setText(goal.description)
        goalStatus.setText(goal.status)
        initialDate = goal.initAt
        goal.finishAt?.run {
            goalEndTime.setText(instantToStringDate(this))
            selectedEndGoal = this
        }
    }

    private fun setupOnClick() {
        saveGoal.setOnClickListener {
            handleActionCrud()
            findNavController().popBackStack()
        }

        deleteGoal.setOnClickListener { builderDialogConfirm().show() }
    }

    private fun handleActionCrud() {
        val goal = Goal(
            title = goalTitle.text.toString(),
            description = goalDescription.text.toString(),
            status = goalStatus.text.toString(),
            initAt = initialDate ?: getInstantDate(),
            finishAt = stringToInstant(goalEndTime.text.toString())
        )

        if (needUpdateGoal) viewModel.updateGoalsByID(goal.copy(id = args.goalId))
        else viewModel.insertGoal(goal)
    }

    private fun setupDatePicker() {
        val calendar = Calendar.getInstance()
        val dateSetListener =
            DatePickerDialog.OnDateSetListener { _, year, monthOfYear, dayOfMonth ->
                calendar.set(Calendar.YEAR, year)
                calendar.set(Calendar.MONTH, monthOfYear)
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                goalEndTime.setText(instantToStringDate(calendar.toInstant().toString()))
            }

        goalEndTime.setOnClickListener {
            DatePickerDialog(
                requireContext(),
                dateSetListener,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            ).show()
        }
    }

    private fun builderDialogConfirm(): AlertDialog {
        val alertDialog = AlertDialog.Builder(requireContext())
        alertDialog.setMessage(getString(R.string.insert_goal_dialog_confirmation_message))
        alertDialog.setCancelable(true)

        alertDialog.setPositiveButton(
            getString(R.string.insert_goal_dialog_confirmation_button)

        ) { dialog, _ ->
            dialog.dismiss()
            viewModel.deleteGoalById(args.goalId)
            findNavController().popBackStack()
        }

        alertDialog.setNegativeButton(getString(R.string.insert_goal_dialog_cancel_button)) { dialog, _ -> dialog.cancel() }

        return alertDialog.create()
    }

    private fun setupSpinner() {
        adapter = ArrayAdapter(requireContext(), R.layout.adapter_status_items, status)
        goalStatus.setAdapter(adapter)
    }
}