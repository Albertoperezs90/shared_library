package com.aperezsi.shared.di

import com.aperezsi.shared.MainActivity
import dagger.Subcomponent

@Subcomponent(modules = [MainModule::class])
interface MainComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {
        fun mainModule(mainModule: MainModule): Builder
        fun build(): MainComponent
    }

}