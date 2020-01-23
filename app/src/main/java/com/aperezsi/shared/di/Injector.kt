package com.aperezsi.shared.di

import com.aperezsi.shared.MainActivity

fun inject(mainActivity: MainActivity) {
    DaggerMainComponent.builder()
        .commonsComponent(mainActivity.commonsComponent)
        .build()
        .inject(mainActivity)
}