package br.com.gabrielmarcos.pokedex.pokedexes.domain.mapper

import br.com.gabrielmarcos.pokedex.pokedexes.data.model.PokedexesResponse
import br.com.gabrielmarcos.pokedex.pokedexes.domain.model.PokedexesNavigation

fun PokedexesResponse.mapToPokedexesNavigation(): PokedexesNavigation {
    return PokedexesNavigation(
        count = count,
        next = next,
        previous = previous
    )
}
