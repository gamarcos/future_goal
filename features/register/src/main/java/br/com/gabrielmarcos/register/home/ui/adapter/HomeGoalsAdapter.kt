package br.com.gabrielmarcos.register.home.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import br.com.gabrielmarcos.core.model.Goal
import br.com.gabrielmarcos.register.R

class HomeGoalsAdapter : ListAdapter<Goal, HomeGoalsAdapterViewHolder>(DiffGoalCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeGoalsAdapterViewHolder =
        HomeGoalsAdapterViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_home_goals_item, parent, false)
        )

    override fun onBindViewHolder(holder: HomeGoalsAdapterViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class HomeGoalsAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val goalTitle = itemView.findViewById<TextView>(R.id.adapter_goal_title)
    private val goalDescription = itemView.findViewById<TextView>(R.id.adapter_goal_description)

    fun bind(goal: Goal) {
        goalTitle.text = goal.description
        goalDescription.text = goal.description
    }
}

private class DiffGoalCallback : DiffUtil.ItemCallback<Goal>() {
    override fun areItemsTheSame(oldItem: Goal, newItem: Goal) = oldItem == newItem
    override fun areContentsTheSame(oldItem: Goal, newItem: Goal) = oldItem == newItem
}
