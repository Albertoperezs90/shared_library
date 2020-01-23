package com.aperezsi.shared

import com.aperezsi.commons.view.BaseActivity
import com.aperezsi.shared.databinding.ActivityMainBinding
import com.aperezsi.shared.di.inject

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override fun getLayout(): Int = R.layout.activity_main

    override fun inject() = inject(this)

    override fun bind(binding: ActivityMainBinding) {
        binding.viewModel = viewModel
    }

    override fun initialize() {
        viewModel.load()
    }

}