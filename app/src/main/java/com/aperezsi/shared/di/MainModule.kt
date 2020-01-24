package com.aperezsi.shared.di

import androidx.lifecycle.ViewModel
import com.aperezsi.commons.di.ViewModelKey
import com.aperezsi.commons.di.ViewModelModule
import com.aperezsi.commons.viewmodel.ViewModelScope
import com.aperezsi.shared.MainUseCase
import com.aperezsi.shared.MainViewModel
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module(includes = [ViewModelModule::class])
class MainModule {

    @Provides
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun provideMainViewModel(mainUseCase: MainUseCase, scope: ViewModelScope): ViewModel {
        return MainViewModel(mainUseCase, scope)
    }

}