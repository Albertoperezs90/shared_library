package com.aperezsi.commons.repository

import com.aperezsi.commons.language.Either
import com.aperezsi.commons.system.NetworkManager
import javax.inject.Inject

abstract class Repository {

    @Inject
    lateinit var networkManager: NetworkManager

    fun <S> invoke(block: () -> S): Either<Throwable, S> {
        return if (!networkManager.isNetworkAvailable()) return Either.Left(Throwable())
        else try {
            Either.Right(block.invoke())
        } catch (e: Exception) {
            Either.Left(Throwable())
        }
    }
}