package br.com.gabrielmarcos.register.insert.di

import br.com.gabrielmarcos.core.database.GoalDatabaseRepository
import br.com.gabrielmarcos.core.di.scopes.FeatureScope
import br.com.gabrielmarcos.core.extensions.viewModel
import br.com.gabrielmarcos.register.insert.ui.InsertGoalsFragment
import br.com.gabrielmarcos.register.insert.ui.InsertGoalsViewModel
import dagger.Module
import dagger.Provides

@Module
class InsertGoalsModule(
    private val fragment: InsertGoalsFragment
) {
    @Provides
    @FeatureScope
    fun providesInsertGoalsFragment(
        repository: GoalDatabaseRepository
    ) = fragment.viewModel { InsertGoalsViewModel(repository = repository) }
}