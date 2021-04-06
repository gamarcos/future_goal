package br.com.gabrielmarcos.core.usecase

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
