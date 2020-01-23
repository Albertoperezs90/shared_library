package com.aperezsi.commons.di

import android.content.Context
import dagger.Component

@Component(modules = [CommonsModule::class])
interface CommonsComponent {

    fun context(): Context

}