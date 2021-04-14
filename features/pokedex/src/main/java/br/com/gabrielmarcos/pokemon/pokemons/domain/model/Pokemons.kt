package br.com.gabrielmarcos.pokemon.pokemons.domain.model

typealias Pokedexes = List<Pokedex>

data class Pokedex(
    val name: String,
    val url: String
)
