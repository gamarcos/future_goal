package br.com.gabrielmarcos.register.insert.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import br.com.gabrielmarcos.core.extensions.getTimestamp
import br.com.gabrielmarcos.core.model.Goal
import br.com.gabrielmarcos.core.model.Status
import br.com.gabrielmarcos.futuregoals.GoalApplication
import br.com.gabrielmarcos.register.R
import br.com.gabrielmarcos.register.insert.di.DaggerInsertGoalsComponent
import br.com.gabrielmarcos.register.insert.di.InsertGoalsModule
import javax.inject.Inject

class InsertGoalsFragment: Fragment() {

    @Inject
    lateinit var viewModel: InsertGoalsViewModel

    private lateinit var adapter: ArrayAdapter<String>
    private lateinit var selectedStatus: String

    private val spinner
        get() = requireActivity().findViewById<Spinner>(R.id.insert_spinner_status)

    private val status = arrayOf(
        Status.TODO.name,
        Status.PROGRESS.name,
        Status.DONE.name
    )

    override fun onAttach(context: Context) {
        super.onAttach(context)
        DaggerInsertGoalsComponent
            .builder()
            .coreComponent(GoalApplication.coreComponent(requireContext()))
            .insertGoalsModule(InsertGoalsModule(this))
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

        setupOnClick()
        setupSpinner()
    }

    private fun setupOnClick() {
        requireActivity().findViewById<Button>(R.id.insert_goals_button).setOnClickListener {
            viewModel.insertGoal(Goal(
                title = requireActivity().findViewById<EditText>(R.id.insert_goal_title).text.toString(),
                description = requireActivity().findViewById<EditText>(R.id.insert_goal_description).text.toString(),
                status = selectedStatus,
                initAt = getTimestamp()
            ))
        }
    }

    private fun setupSpinner() {
        adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, status)

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) { selectedStatus = status[position] }
        }
    }
}