package br.com.gabrielmarcos.pokemon.pokemons.data.model

data class PokemonsResponse(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<PokemonResponse>?
)

data class PokemonResponse(
    val name: String,
    val url: String
)
