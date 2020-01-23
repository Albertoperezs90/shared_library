package com.aperezsi.shared

import com.aperezsi.shared.databinding.ActivityMainBinding
import com.aperezsi.shared.di.inject

class MainActivity : BaseTestActivity<ActivityMainBinding, MainViewModel>() {

    override fun getLayout(): Int = R.layout.activity_main

    override fun inject() = inject(this)

    override fun bind(binding: ActivityMainBinding) {
        binding.viewModel = viewmodel
    }

    override fun initialize() {
        viewmodel.load()
    }

}