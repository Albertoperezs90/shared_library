package com.aperezsi.shared

import com.aperezsi.commons.language.Either
import com.aperezsi.commons.repository.Repository
import retrofit2.await

class MainRepository(private val mainApio: MainApio) : Repository() {

    suspend fun loadRandomData(params: String): Either<String, String> {
        val result = mainApio.getData().await()
        return Either.Right(result.string())
    }
}