package br.com.gabrielmarcos.register.insert.di

import br.com.gabrielmarcos.core.di.CoreComponent
import br.com.gabrielmarcos.core.di.scopes.FeatureScope
import br.com.gabrielmarcos.register.insert.ui.InsertGoalsFragment
import dagger.Component


@FeatureScope
@Component(
    modules = [InsertGoalsModule::class],
    dependencies = [CoreComponent::class]
)
interface InsertGoalsComponent {
    fun inject(insertGoalsFragment: InsertGoalsFragment)
}