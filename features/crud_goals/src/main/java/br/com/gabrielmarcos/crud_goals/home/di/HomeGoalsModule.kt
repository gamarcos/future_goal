package br.com.gabrielmarcos.crud_goals.home.di

import br.com.gabrielmarcos.core.database.GoalDatabaseRepository
import br.com.gabrielmarcos.core.di.scopes.FeatureScope
import br.com.gabrielmarcos.core.extensions.viewModel
import br.com.gabrielmarcos.crud_goals.home.ui.HomeGoalsFragment
import br.com.gabrielmarcos.crud_goals.home.ui.HomeGoalsViewModel
import br.com.gabrielmarcos.crud_goals.home.ui.adapter.HomeGoalsAdapter
import dagger.Module
import dagger.Provides

@Module
class HomeGoalsModule(
    private val fragment: HomeGoalsFragment
) {

    @Provides
    @FeatureScope
    fun providesHomeGoalsViewModel(
        repository: GoalDatabaseRepository
    ) = fragment.viewModel { HomeGoalsViewModel(repository = repository) }

    @Provides
    @FeatureScope
    fun providesHomeGoalsAdapter() = HomeGoalsAdapter()
}