package com.aperezsi.commons.language

sealed class Either<out F, out S> {

    data class Left<out F>(val error: F) : Either<F, Nothing>()
    data class Right<out S>(val result: S) : Either<Nothing, S>()

    val isLeft get() = this is Left<F>
    val isRight get() = this is Right<S>

    fun toRightOrNull(): S? = when (this) {
        is Left -> null
        is Right -> result
    }

    fun fold(functionLeft: (F) -> Unit, functionRight: (S) -> Unit) {
        when (this) {
            is Left -> functionLeft(error)
            is Right -> functionRight(result)
        }
    }

}