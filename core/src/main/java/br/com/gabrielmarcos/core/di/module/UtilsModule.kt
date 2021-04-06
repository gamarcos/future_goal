package br.com.gabrielmarcos.core.di.module

import br.com.gabrielmarcos.core.data.cache.Cache
import br.com.gabrielmarcos.core.data.cache.ICache
import br.com.gabrielmarcos.core.utils.ThemeUtils
import br.com.gabrielmarcos.core.utils.ThemeUtilsImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class UtilsModule {

    @Singleton
    @Binds
    abstract fun bindThemeUtils(themeUtilsImpl: ThemeUtilsImpl): ThemeUtils

    @Singleton
    @Binds
    abstract fun bindCache(cache: Cache): ICache
}
