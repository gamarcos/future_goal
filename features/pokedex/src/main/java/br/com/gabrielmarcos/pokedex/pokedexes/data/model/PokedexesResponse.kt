package br.com.gabrielmarcos.pokedex.pokedexes.data.model

data class PokedexesResponse(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<PokedexResponse>?
)

data class PokedexResponse(
    val name: String,
    val url: String
)
