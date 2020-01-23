package com.aperezsi.commons.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.aperezsi.commons.di.CommonsComponent
import com.aperezsi.commons.di.DaggerCommonsComponent
import com.aperezsi.commons.viewmodel.BaseViewModel
import javax.inject.Inject

abstract class BaseActivity<B : ViewDataBinding, VM : BaseViewModel> : AppCompatActivity() {

    @Inject
    lateinit var factory: ViewModelProvider.Factory

    lateinit var viewmodel: VM

    var binding: B? = null

    val commonsComponent: CommonsComponent by lazy {
        DaggerCommonsComponent.builder()
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, getLayout())
        inject()
        viewmodel = ViewModelProviders.of(this, factory).get(getViewModelClass())
        initialize()
    }

    abstract fun getLayout(): Int
    abstract fun inject()
    abstract fun getViewModelClass(): Class<VM>
    abstract fun bind(binding: B)
    abstract fun initialize()
}
