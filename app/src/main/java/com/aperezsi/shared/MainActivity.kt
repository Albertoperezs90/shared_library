package com.aperezsi.shared

import com.aperezsi.commons.view.BaseActivity
import com.aperezsi.shared.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override fun getLayout(): Int = R.layout.activity_main

    override fun bind(binding: ActivityMainBinding) {
        binding.viewModel = viewmodel
    }

    override fun initialize() {
        viewmodel.load()
    }

}