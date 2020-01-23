package com.aperezsi.shared

import androidx.databinding.ViewDataBinding
import com.aperezsi.commons.view.BaseActivity
import com.aperezsi.commons.viewmodel.BaseViewModel

abstract class BaseTestActivity<V : ViewDataBinding, VM : BaseViewModel> : BaseActivity<V, VM>() {

    
    lateinit var viewmodel: VM

    override fun getViewModel(): VM? = viewmodel
}