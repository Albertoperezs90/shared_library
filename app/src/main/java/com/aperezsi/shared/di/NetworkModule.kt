package com.aperezsi.shared.di

import com.aperezsi.shared.MainApio
import com.aperezsi.shared.MainRepository
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class NetworkModule {

    @Provides
    fun providesMainRepository(mainApio: MainApio): MainRepository {
        return MainRepository(mainApio)
    }

    @Provides
    fun providesMainApio(): MainApio {
        return Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .build()
            .create(MainApio::class.java)
    }

}