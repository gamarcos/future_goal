package br.com.gabrielmarcos.crud_goals.crud.di

import br.com.gabrielmarcos.core.database.GoalDatabaseRepository
import br.com.gabrielmarcos.core.di.scopes.FeatureScope
import br.com.gabrielmarcos.core.extensions.viewModel
import br.com.gabrielmarcos.crud_goals.crud.ui.CrudGoalsFragment
import br.com.gabrielmarcos.crud_goals.crud.ui.CrudGoalsViewModel
import dagger.Module
import dagger.Provides

@Module
class CrudGoalsModule(
    private val fragment: CrudGoalsFragment
) {
    @Provides
    @FeatureScope
    fun providesInsertGoalsFragment(
        repository: GoalDatabaseRepository
    ) = fragment.viewModel { CrudGoalsViewModel(repository = repository) }
}