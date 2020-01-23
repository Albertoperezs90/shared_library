package com.aperezsi.commons.system

import android.annotation.SuppressLint
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities.TRANSPORT_CELLULAR
import android.net.NetworkCapabilities.TRANSPORT_ETHERNET
import android.net.NetworkCapabilities.TRANSPORT_WIFI
import android.os.Build
import com.aperezsi.commons.framework.SystemVersions


class NetworkManager(private val context: Context, private val systemVersions: SystemVersions) {

    @SuppressLint("NewApi")
    @Suppress("DEPRECATION")
    fun isNetworkAvailable(): Boolean {
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
        return if (systemVersions.isEqualOrAboveGivenVersion(Build.VERSION_CODES.Q)) {
            val network = connectivityManager?.activeNetwork
            val capabilities = connectivityManager?.getNetworkCapabilities(network)
            return capabilities != null && (capabilities.hasTransport(TRANSPORT_CELLULAR) or capabilities.hasTransport(TRANSPORT_WIFI) or capabilities.hasTransport(TRANSPORT_ETHERNET))
        } else {
            val networkInfo = connectivityManager?.activeNetworkInfo
            networkInfo != null && networkInfo.isConnectedOrConnecting
        }

    }
}