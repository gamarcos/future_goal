package br.com.gabrielmarcos.pokemon.pokemons.domain.model

data class PokemonsNavigation(
    val count: Int,
    val next: String?,
    val previous: String?
)
