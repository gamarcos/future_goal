package br.com.gabrielmarcos.core.usecase

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.SendChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce

abstract class UseCase<in Params, R>(
    private val coroutineDispatcher: CoroutineDispatcher
) {

    private var job: Job? = null
    private var channel: ReceiveChannel<R>? = null

    private lateinit var runScope: CoroutineScope
    private var postScope = CoroutineScope(coroutineDispatcher)

    private val dispatcher = ResultDispatcher<R>()

    protected abstract suspend fun run(channel: SendChannel<R>, params: Params? = null)

    operator fun invoke(
        coroutineScope: CoroutineScope,
        input: Params? = null,
        dsl: ResultDispatcher<R>.() -> Unit
    ): Job {
        checkJobReset()

        runScope = coroutineScope
        dispatcher.apply(dsl)

        return runScope.launch {
            postScope.launch { dispatcher.onLoading(Result.Loading) }
            startChannelAndRun(input)
        }.also { job = it }
    }

    private fun checkJobReset() {
        if (isActive()) restart() else reset()
    }

    private suspend fun startChannelAndRun(params: Params?) {
        channel = runScope.produce {
            runCatching { run(channel, params) }
                .onFailure { handleException(it) }
        }

        channel?.consumeEach {
            postScope.launch { dispatcher.onSuccess(Result.Success(it)) }
            reset()
        }
    }

    private suspend fun handleException(throwable: Throwable) {
        onError(throwable)
        cancel()
    }

    private fun isActive(): Boolean = job?.isActive == true

    private fun restart() {
        job?.cancel(RestartCancellationException())
    }

    private fun reset() {
        job?.cancel()
        cleanup()
    }

    private fun cancel() {
        job?.cancel(ForcedCancellationException())
        cleanup()
    }

    private fun cleanup() {
        job = null
        channel = null
    }

    protected open suspend fun onError(throwable: Throwable) {
        postScope.launch { dispatcher.onError(Result.Error(throwable)) }
    }

    class ForcedCancellationException : CancellationException()
    class RestartCancellationException : CancellationException()
}
