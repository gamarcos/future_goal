package br.com.gabrielmarcos.crud_goals.crud.di

import br.com.gabrielmarcos.core.di.CoreComponent
import br.com.gabrielmarcos.core.di.scopes.FeatureScope
import br.com.gabrielmarcos.crud_goals.crud.ui.CrudGoalsFragment
import dagger.Component


@FeatureScope
@Component(
    modules = [CrudGoalsModule::class],
    dependencies = [CoreComponent::class]
)
interface CrudGoalsComponent {
    fun inject(crudGoalsFragment: CrudGoalsFragment)
}