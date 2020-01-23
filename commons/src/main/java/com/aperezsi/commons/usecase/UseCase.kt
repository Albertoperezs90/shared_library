package com.aperezsi.commons.usecase

import com.aperezsi.commons.language.Either
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.async

abstract class UseCase<F, S, P> {

    val job = SupervisorJob()

    fun execute(params: P): Deferred<Either<F, S>> {
        return CoroutineScope(Dispatchers.IO + job).async { run(params) }
    }

    abstract suspend fun run(params: P): Either<F, S>
}