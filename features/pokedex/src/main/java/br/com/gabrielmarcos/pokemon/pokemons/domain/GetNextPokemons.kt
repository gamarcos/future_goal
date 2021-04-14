package br.com.gabrielmarcos.pokemon.pokemons.domain

import br.com.gabrielmarcos.core.data.cache.ICache
import br.com.gabrielmarcos.core.usecase.UseCase
import br.com.gabrielmarcos.pokemon.pokemons.data.PokemonRepository
import br.com.gabrielmarcos.pokemon.pokemons.data.model.PokemonResponse
import br.com.gabrielmarcos.pokemon.pokemons.domain.mapper.mapToPokemonsNavigation
import br.com.gabrielmarcos.pokemon.pokemons.domain.model.PokemonsNavigation
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.channels.SendChannel
import javax.inject.Inject

class GetNextPokemons @Inject constructor(
    private val repository: PokemonRepository,
    private val cache: ICache,
    private val coroutineDispatcher: CoroutineDispatcher
) : UseCase<Unit, List<PokemonResponse>?>(coroutineDispatcher) {

    override suspend fun run(channel: SendChannel<List<PokemonResponse>?>, params: Unit?) {
        cache.get<PokemonsNavigation>(POKEDEXES_NAVIGATION)?.next?.takeIf {
            it.isNotBlank()
        }?.let { nextPage ->
            val result = repository.getPokemonsPage(nextPage)
            val navigation = result.mapToPokemonsNavigation()
            cache.put(POKEDEXES_NAVIGATION, navigation)
            channel.send(result.results)
            channel.close()
        }
    }
}
