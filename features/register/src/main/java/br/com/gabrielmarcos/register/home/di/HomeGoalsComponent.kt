package br.com.gabrielmarcos.register.home.di

import br.com.gabrielmarcos.core.di.CoreComponent
import br.com.gabrielmarcos.core.di.scopes.FeatureScope
import br.com.gabrielmarcos.register.home.ui.HomeGoalsFragment
import dagger.Component

@FeatureScope
@Component(
    modules = [HomeGoalsModule::class],
    dependencies = [CoreComponent::class]
)
interface HomeGoalsComponent {

    fun inject(homeGoalsFragment: HomeGoalsFragment)

}