package com.aperezsi.shared.di

import com.aperezsi.commons.data.HttpClient
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
    fun providesMainApio(httpClient: HttpClient): MainApio {
        return Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .client(httpClient.getHttpClient())
            .build()
            .create(MainApio::class.java)
    }

}