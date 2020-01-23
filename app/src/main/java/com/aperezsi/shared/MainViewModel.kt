package com.aperezsi.shared

import com.aperezsi.commons.viewmodel.BaseViewModel
import kotlinx.coroutines.launch

class MainViewModel(private val mainUseCase: MainUseCase) : BaseViewModel() {

    fun load() {
        viewModelScope.launch {
            println("Viewmodel calling use case")
            val useCase = mainUseCase.execute("params")
            println("Viewmodel already has called use case")
            println(useCase.await().toRightOrNull())
        }
    }
}