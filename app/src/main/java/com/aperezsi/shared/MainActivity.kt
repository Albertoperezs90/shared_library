package com.aperezsi.shared

import com.aperezsi.commons.view.BaseActivity
import com.aperezsi.shared.databinding.ActivityMainBinding
import com.aperezsi.shared.di.MainModule

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override fun getLayout(): Int = R.layout.activity_main

    override fun inject() {
        (application as TestApplication).coreComponent.mainComponent().mainModule(MainModule()).build().inject(this)
    }

    override fun getViewModelClass(): Class<MainViewModel> = MainViewModel::class.java

    override fun bind(binding: ActivityMainBinding) {
        binding.viewModel = viewmodel
    }

    override fun initialize() {
        viewmodel.load()
    }

}