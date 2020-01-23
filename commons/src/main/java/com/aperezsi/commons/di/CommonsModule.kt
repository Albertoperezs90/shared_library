package com.aperezsi.commons.di

import android.content.Context
import dagger.Module
import dagger.Provides

@Module(includes = [UtilsModule::class])
class CommonsModule(private val context: Context) {

    @Provides
    fun providesContext(): Context {
        return context
    }
}