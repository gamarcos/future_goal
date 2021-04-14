package br.com.gabrielmarcos.pokemon.pokemons.domain.mapper

import br.com.gabrielmarcos.pokemon.pokemons.data.model.PokemonsResponse
import br.com.gabrielmarcos.pokemon.pokemons.domain.model.PokemonsNavigation

fun PokemonsResponse.mapToPokemonsNavigation(): PokemonsNavigation {
    return PokemonsNavigation(
        count = count,
        next = next,
        previous = previous
    )
}
