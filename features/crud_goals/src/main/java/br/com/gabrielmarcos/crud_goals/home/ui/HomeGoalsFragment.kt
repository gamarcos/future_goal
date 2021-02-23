package br.com.gabrielmarcos.crud_goals.home.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import br.com.gabrielmarcos.core.extensions.observe
import br.com.gabrielmarcos.core.model.Goal
import br.com.gabrielmarcos.futuregoals.GoalApplication.Companion.coreComponent
import br.com.gabrielmarcos.crud_goals.R
import br.com.gabrielmarcos.crud_goals.home.di.DaggerHomeGoalsComponent
import br.com.gabrielmarcos.crud_goals.home.di.HomeGoalsModule
import br.com.gabrielmarcos.crud_goals.home.ui.adapter.HomeGoalsAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import javax.inject.Inject

class HomeGoalsFragment : Fragment() {

    @Inject
    lateinit var viewModel: HomeGoalsViewModel

    @Inject
    lateinit var viewAdapter: HomeGoalsAdapter

    private val addNewGoals
        get() = requireActivity().findViewById<FloatingActionButton>(R.id.goals_add_button)

    private val goalsAdapter
        get() = requireActivity().findViewById<RecyclerView>(R.id.goals_recycler_view)

    override fun onAttach(context: Context) {
        super.onAttach(context)
        DaggerHomeGoalsComponent
            .builder()
            .coreComponent(coreComponent(requireContext()))
            .homeGoalsModule(HomeGoalsModule(this))
            .build()
            .inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_home_goals,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupBindView()
        setupRecyclerView()
        setupObserver()
    }

    private fun setupBindView() {
        addNewGoals.setOnClickListener { findNavController().navigate(buildNavigationArgs()) }
    }

    private fun setupRecyclerView() {
        goalsAdapter.apply {
            viewAdapter.apply {
                onItemClick = { findNavController().navigate(buildNavigationArgs(it)) }
                adapter = this
            }
        }
    }

    private fun setupObserver() {
        observe(viewModel.goals, ::onViewDataChange)
    }

    private fun onViewDataChange(viewData: List<Goal>) {
        viewAdapter.submitList(viewData)
    }

    private fun buildNavigationArgs(arg: Long = 0L): NavDirections =
        HomeGoalsFragmentDirections.actionHomeToCrudGoal(arg)
}