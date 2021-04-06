package br.com.gabrielmarcos.core.data.cache

import javax.inject.Inject

interface ICache {

    fun <O : Any> put(key: String, obj: O)
    fun <O : Any> get(key: String): O?
    fun remove(key: String)
    fun clear()
}

class Cache @Inject constructor() : ICache {

    private val container: HashMap<String, Any> = hashMapOf()

    override fun <O : Any> put(key: String, obj: O) {
        container[key] = obj
    }

    @Suppress("UNCHECKED_CAST")
    override fun <O : Any> get(key: String): O? {
        return container[key] as? O
    }

    override fun remove(key: String) {
        container.remove(key)
    }

    override fun clear() {
        container.clear()
    }
}
