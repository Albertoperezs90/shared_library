package com.aperezsi.shared.di

import com.aperezsi.shared.MainRepository
import com.aperezsi.shared.MainUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun providesMainUseCase(mainRepository: MainRepository): MainUseCase {
        return MainUseCase(mainRepository)
    }

}