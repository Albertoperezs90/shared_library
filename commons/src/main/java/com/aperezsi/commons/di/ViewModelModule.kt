package com.aperezsi.commons.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.aperezsi.commons.viewmodel.ViewModelFactory
import dagger.Module
import dagger.Provides

@Module(includes = [ScopeModule::class])
class ViewModelModule {

    @Provides
    fun providesViewModelFactory(map: Map<Class<out ViewModel>, @JvmSuppressWildcards ViewModel>): ViewModelProvider.Factory {
        return ViewModelFactory(map)
    }

}