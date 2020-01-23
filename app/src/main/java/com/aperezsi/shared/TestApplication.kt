package com.aperezsi.shared

import android.app.Application
import com.aperezsi.commons.di.ViewModelModule
import com.aperezsi.shared.di.CoreComponent
import com.aperezsi.shared.di.DaggerCoreComponent
import com.aperezsi.shared.di.NetworkModule
import com.aperezsi.shared.di.UseCaseModule

class TestApplication : Application() {

    val coreComponent: CoreComponent by lazy {
        DaggerCoreComponent.builder()
            .viewModelModule(ViewModelModule())
            .networkModule(NetworkModule())
            .useCaseModule(UseCaseModule())
            .build()
    }

}