package com.aperezsi.commons.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.aperezsi.commons.di.CommonsComponent
import com.aperezsi.commons.di.DaggerCommonsComponent
import com.aperezsi.commons.viewmodel.BaseViewModel

abstract class BaseActivity<B : ViewDataBinding, VM : BaseViewModel> : AppCompatActivity() {

    var binding: B? = null

    val commonsComponent: CommonsComponent by lazy {
        DaggerCommonsComponent.builder()
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, getLayout())
        initialize()
    }

    abstract fun getLayout(): Int
    abstract fun getViewModel(): VM?
    abstract fun inject()
    abstract fun bind(binding: B)
    abstract fun initialize()
}
