package com.aperezsi.commons.di

import com.aperezsi.commons.viewmodel.ViewModelScope
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.Dispatchers
import javax.inject.Named

@Module
class ScopeModule {

    @Provides
    @Named("IO")
    fun provideIO(): ViewModelScope {
        return ViewModelScope(Dispatchers.IO)
    }

    @Provides
    @Named("Main")
    fun provideMain(): ViewModelScope {
        return ViewModelScope(Dispatchers.Main)
    }

    @Provides
    @Named("Unconfined")
    fun provideUnconfined(): ViewModelScope {
        return ViewModelScope(Dispatchers.Unconfined)
    }

    @Provides
    fun provideDefault(): ViewModelScope {
        return ViewModelScope(Dispatchers.Default)
    }
}