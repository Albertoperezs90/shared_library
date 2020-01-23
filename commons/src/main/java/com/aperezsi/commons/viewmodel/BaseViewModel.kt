package com.aperezsi.commons.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob

abstract class BaseViewModel : ViewModel() {

    private val job = SupervisorJob()

    protected val viewModelScope get() = CoroutineScope(Dispatchers.Main + job)


}