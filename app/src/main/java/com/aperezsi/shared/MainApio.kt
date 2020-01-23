package com.aperezsi.shared

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

interface MainApio {

    @GET("todos/1")
    fun getData(): Call<ResponseBody>
}