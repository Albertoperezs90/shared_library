package com.aperezsi.commons.usecase

import com.aperezsi.commons.language.Either
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.SupervisorJob

abstract class UseCase<F, S, P> {

    val job = SupervisorJob()

    abstract suspend fun execute(params: P): Deferred<Either<F, S>>

}