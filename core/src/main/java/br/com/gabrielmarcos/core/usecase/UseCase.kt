package br.com.gabrielmarcos.core.usecase

import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

abstract class UseCase<in I> : CoroutineScope {

    private val mainDispatcher = Dispatchers.Main
    private val ioDispatcher = Dispatchers.IO
    private val parentJob = SupervisorJob()

    override val coroutineContext: CoroutineContext
        get() = parentJob + mainDispatcher

    protected abstract suspend fun run(input: I)

    operator fun invoke(input: I) {
        launch {
            withContext(ioDispatcher) {
                run(input)
            }
        }
    }
}

class TestUse(
    private val liveData: MutableLiveData<String>
) : UseCase<String>() {

    override suspend fun run(input: String) {
        liveData.postValue(test(input))
    }

    private suspend fun test(param: String): String {
        delay(2000)
        return "${param}teste"
    }
}
