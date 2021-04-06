package br.com.gabrielmarcos.pokedex.pokedexes.domain.model

typealias Pokedexes = List<Pokedex>

data class Pokedex(
    val name: String,
    val url: String
)
