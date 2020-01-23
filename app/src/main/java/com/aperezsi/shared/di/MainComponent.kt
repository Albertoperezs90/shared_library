package com.aperezsi.shared.di

import com.aperezsi.commons.di.CommonsComponent
import com.aperezsi.shared.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MainModule::class], dependencies = [CommonsComponent::class])
interface MainComponent {

    fun inject(mainActivity: MainActivity)

}