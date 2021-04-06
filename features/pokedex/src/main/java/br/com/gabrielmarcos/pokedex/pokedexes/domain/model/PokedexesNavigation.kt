package br.com.gabrielmarcos.pokedex.pokedexes.domain.model

data class PokedexesNavigation(
    val count: Int,
    val next: String?,
    val previous: String?
)
