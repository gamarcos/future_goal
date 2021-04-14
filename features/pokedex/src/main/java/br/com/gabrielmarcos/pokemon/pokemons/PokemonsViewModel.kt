package br.com.gabrielmarcos.pokemon.pokemons

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.gabrielmarcos.pokemon.pokemons.data.model.PokemonResponse
import br.com.gabrielmarcos.pokemon.pokemons.domain.GetNextPokemons
import br.com.gabrielmarcos.pokemon.pokemons.domain.GetPokemons
import javax.inject.Inject

class PokemonsViewModel @Inject constructor(
    var getPokemonsUseCase: GetPokemons,
    var getNextPokemonsUseCase: GetNextPokemons
) : ViewModel() {

    val error: MutableLiveData<String> = MutableLiveData()
    val loading: MutableLiveData<Boolean> = MutableLiveData()
    val pokedexes: MutableLiveData<List<PokemonResponse>?> = MutableLiveData()

    fun getPokemons() {
        getPokemonsUseCase(
            coroutineScope = viewModelScope,
            params = ""
        ) {
            onLoading = { loading.postValue(true) }
            onSuccess = { handleSuccessResult(it.data) }
            onError = { handleErrorResult(it.throwable.message.toString()) }
        }
    }

    fun getNextPokemons() {
        getNextPokemonsUseCase(
            coroutineScope = viewModelScope
        ) {
            onLoading = { loading.postValue(true) }
            onSuccess = { requestMethodWithDalay { handleSuccessResult(it.data) } }
            onError = { handleErrorResult(it.throwable.message.toString()) }
        }
    }

    private fun handleErrorResult(message: String) {
        error.postValue(message)
        loading.postValue(false)
    }

    private fun handleSuccessResult(result: List<PokemonResponse>?) {
        pokedexes.postValue(result)
        loading.postValue(false)
    }

    //TODO:: Remove
    inline fun requestMethodWithDalay(crossinline func: () -> Unit) {
        Handler(Looper.getMainLooper()).postDelayed({ func() }, 2000)
    }
}