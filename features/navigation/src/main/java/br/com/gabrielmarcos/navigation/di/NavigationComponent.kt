package br.com.gabrielmarcos.navigation.di

import br.com.gabrielmarcos.core.di.CoreComponent
import br.com.gabrielmarcos.core.di.scopes.FeatureScope
import br.com.gabrielmarcos.navigation.NavigationManagerFragment
import dagger.Component

@FeatureScope
@Component(dependencies = [CoreComponent::class])
interface NavigationComponent {
    fun inject(navigationManagerFragment: NavigationManagerFragment)
}