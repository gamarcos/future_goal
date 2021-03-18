package br.com.gabrielmarcos.core.network.services

sealed class NetworkState {

    object Success: NetworkState()

    object Loading : NetworkState()

    object Error : NetworkState()

    fun isSuccess() = this is Success

    fun isLoading() = this is Loading

    fun isError() = this is Error
}
