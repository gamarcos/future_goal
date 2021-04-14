package br.com.gabrielmarcos.pokemon.di

import br.com.gabrielmarcos.core.di.CoreComponent
import br.com.gabrielmarcos.core.di.scopes.FeatureScope
import br.com.gabrielmarcos.pokemon.pokemons.PokemonsFragment
import br.com.gabrielmarcos.pokemon.pokemons.di.PokemonsModuleBuilder
import br.com.gabrielmarcos.pokemon.di.modules.PokemonsNetworkModule
import dagger.Component

@FeatureScope
@Component(
    dependencies = [CoreComponent::class],
    modules = [
        PokemonsNetworkModule::class,
        PokemonsModuleBuilder::class
    ]
)

interface PokemonsComponent {
    fun inject(pokemons: PokemonsFragment)
}
