package com.aperezsi.shared

import com.aperezsi.commons.viewmodel.BaseViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(private val mainUseCase: MainUseCase) : BaseViewModel() {

    fun load() {
        viewModelScope.launch {
            println("Viewmodel calling use case")
            delay(5000)
            val useCase = mainUseCase.execute("params")
            println("Viewmodel already has called use case")
            println(useCase.await().toRightOrNull())
        }
    }

}