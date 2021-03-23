package br.com.gabrielmarcos.core.usecase

import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.*

abstract class UseCase<I, out O> {
    abstract operator fun invoke(param: I)
}

class TestUse(
    private val liveData: MutableLiveData<String>,
    private val scope: CoroutineScope
) : UseCase<String, String>() {

    override fun invoke(param: String) {
        scope.launch {
            withContext(Dispatchers.IO) {
                liveData.postValue(test(param))
            }
        }
    }

    private suspend fun test(param: String): String {
        delay(2000)
        return "${param}teste"
    }
}


