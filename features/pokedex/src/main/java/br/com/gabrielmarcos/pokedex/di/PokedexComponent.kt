package br.com.gabrielmarcos.pokedex.di

import br.com.gabrielmarcos.core.di.CoreComponent
import br.com.gabrielmarcos.core.di.scopes.FeatureScope
import br.com.gabrielmarcos.pokedex.pokedexes.PokedexesFragment
import br.com.gabrielmarcos.pokedex.pokedexes.di.PokedexesModuleBuilder
import br.com.gabrielmarcos.pokedex.di.modules.PokedexNetworkModule
import dagger.Component

@FeatureScope
@Component(
    dependencies = [CoreComponent::class],
    modules = [
        PokedexNetworkModule::class,
        PokedexesModuleBuilder::class
    ]
)

interface PokedexComponent {
    fun inject(pokedexes: PokedexesFragment)
}
