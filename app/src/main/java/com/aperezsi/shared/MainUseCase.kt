package com.aperezsi.shared

import com.aperezsi.commons.language.Either
import com.aperezsi.commons.usecase.UseCase

class MainUseCase(private val mainRepository: MainRepository) : UseCase<String, String, String>() {

    override suspend fun run(params: String): Either<String, String> {
        return mainRepository.loadRandomData(params)
    }

}