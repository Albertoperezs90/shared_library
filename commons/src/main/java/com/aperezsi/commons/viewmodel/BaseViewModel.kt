package com.aperezsi.commons.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlin.coroutines.CoroutineContext

abstract class BaseViewModel(private val scope: CoroutineContext) : ViewModel() {

    private val job = SupervisorJob()

    protected val viewModelScope get() = CoroutineScope(scope + job)


}