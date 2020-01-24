package com.aperezsi.shared

import com.aperezsi.commons.viewmodel.BaseViewModel
import com.aperezsi.commons.viewmodel.ViewModelScope
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Named

class MainViewModel @Inject constructor(
    private val mainUseCase: MainUseCase,
    @Named("IO") scope: ViewModelScope
) : BaseViewModel(scope.context) {

    var lol: String? = null

    fun load() {
        viewModelScope.launch {
            println("Viewmodel calling use case")
            val useCase = mainUseCase.execute("params")
            println("Viewmodel already has called use case")
            lol = useCase.await().toRightOrNull()
        }
    }

}