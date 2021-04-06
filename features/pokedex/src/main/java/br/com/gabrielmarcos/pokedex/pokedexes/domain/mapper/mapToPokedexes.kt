package br.com.gabrielmarcos.pokedex.pokedexes.domain.mapper

import br.com.gabrielmarcos.pokedex.pokedexes.data.model.PokedexResponse
import br.com.gabrielmarcos.pokedex.pokedexes.data.model.PokedexesResponse
import br.com.gabrielmarcos.pokedex.pokedexes.domain.model.Pokedex
import br.com.gabrielmarcos.pokedex.pokedexes.domain.model.Pokedexes
import br.com.gabrielmarcos.pokedex.pokedexes.domain.model.PokedexesNavigation

fun PokedexesResponse.mapToPokedexes(): Pokedexes {
    return results.mapToPokedex()
}

private fun List<PokedexResponse>?.mapToPokedex(): List<Pokedex> {
    return this?.map { item ->
        Pokedex(
            name = item.name,
            url = item.url
        )
    } ?: emptyList()
}
