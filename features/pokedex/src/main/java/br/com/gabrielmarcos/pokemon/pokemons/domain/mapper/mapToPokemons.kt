package br.com.gabrielmarcos.pokemon.pokemons.domain.mapper

import br.com.gabrielmarcos.pokemon.pokemons.data.model.PokemonResponse
import br.com.gabrielmarcos.pokemon.pokemons.data.model.PokemonsResponse
import br.com.gabrielmarcos.pokemon.pokemons.domain.model.Pokedex
import br.com.gabrielmarcos.pokemon.pokemons.domain.model.Pokedexes

fun PokemonsResponse.mapToPokemons(): Pokedexes {
    return results.mapToPokemons()
}

private fun List<PokemonResponse>?.mapToPokemons(): List<Pokedex> {
    return this?.map { item ->
        Pokedex(
            name = item.name,
            url = item.url
        )
    } ?: emptyList()
}
