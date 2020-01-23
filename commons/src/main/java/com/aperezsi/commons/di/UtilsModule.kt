package com.aperezsi.commons.di

import android.content.Context
import com.aperezsi.commons.framework.SystemVersions
import com.aperezsi.commons.system.NetworkManager
import dagger.Module
import dagger.Provides

@Module
class UtilsModule {

    @Provides
    fun providesSystemVersions(): SystemVersions {
        return SystemVersions()
    }

    @Provides
    fun providesConnectivityHelper(context: Context, systemVersions: SystemVersions): NetworkManager {
        return NetworkManager(context, systemVersions)
    }

}