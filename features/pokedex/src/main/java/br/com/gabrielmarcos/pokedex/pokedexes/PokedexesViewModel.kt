package br.com.gabrielmarcos.pokedex.pokedexes

import android.os.Handler
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.gabrielmarcos.pokedex.pokedexes.data.model.PokedexResponse
import br.com.gabrielmarcos.pokedex.pokedexes.domain.GetNextPokedexes
import br.com.gabrielmarcos.pokedex.pokedexes.domain.GetPokedexes
import javax.inject.Inject

class PokedexesViewModel @Inject constructor(
    var getPokedexesUseCase: GetPokedexes,
    var getNextPokedexesUseCase: GetNextPokedexes
) : ViewModel() {

    val error: MutableLiveData<String> = MutableLiveData()
    val loading: MutableLiveData<Boolean> = MutableLiveData()
    val pokedexes: MutableLiveData<List<PokedexResponse>?> = MutableLiveData()

    fun getPokedexes() {
        getPokedexesUseCase(
            coroutineScope = viewModelScope,
            input = ""
        ) {
            onLoading = { loading.postValue(true) }
            onSuccess = { handleSuccessResult(it.data) }
            onError = { handleErrorResult(it.throwable.message.toString()) }
        }
    }

    fun getNextPokedexes() {
        Handler().postDelayed({
            getNextPokedexesUseCase(
                coroutineScope = viewModelScope
            ) {
                onLoading = { loading.postValue(true) }
                onSuccess = {
                    handleSuccessResult(it.data)
                }
                onError = {
                    handleErrorResult(it.throwable.message.toString())
                }
            }
        }, 2000)
    }

    private fun handleErrorResult(message: String) {
        error.postValue(message)
        loading.postValue(false)
    }

    private fun handleSuccessResult(result: List<PokedexResponse>?) {
        pokedexes.postValue(result)
        loading.postValue(false)
    }
}