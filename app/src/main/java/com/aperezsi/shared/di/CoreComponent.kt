package com.aperezsi.shared.di

import com.aperezsi.commons.di.ViewModelModule
import dagger.Component

@Component(modules = [ViewModelModule::class, NetworkModule::class, UseCaseModule::class])
interface CoreComponent {

    fun mainComponent(): MainComponent.Builder

}