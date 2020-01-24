package com.aperezsi.shared

import com.aperezsi.commons.language.Either
import com.aperezsi.commons.viewmodel.BaseViewModelTest
import com.aperezsi.commons.viewmodel.ViewModelScope
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Test

class MainViewModelTest : BaseViewModelTest() {

    private val useCase: MainUseCase = mock()
    private val scope: ViewModelScope = ViewModelScope(Dispatchers.Unconfined)

    private val mainViewModel = MainViewModel(useCase, scope)

    @Test
    fun `test`() {
        //Given
        runBlocking { whenever(useCase.execute(any())).thenReturn(CompletableDeferred(Either.Right("holaa"))) }

        //When
        mainViewModel.load()

        //Then
        assertEquals("holaa", mainViewModel.lol)
    }
}