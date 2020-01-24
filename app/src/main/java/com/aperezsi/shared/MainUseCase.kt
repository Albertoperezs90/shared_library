package com.aperezsi.shared

import com.aperezsi.commons.language.Either
import com.aperezsi.commons.usecase.UseCase
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

class MainUseCase(private val mainRepository: MainRepository) : UseCase<String, String, String>() {

    override suspend fun execute(params: String): Deferred<Either<String, String>> {
        return GlobalScope.async { mainRepository.loadRandomData(params) }
    }

}