package com.example.coroutine.kotlin_singleton_example.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MyRetrofitBuilder {
    const val BAES_URL:String = "https://open-api.xyz/"

    val retrofitBuilder : Retrofit.Builder by lazy {
            Retrofit.Builder()
                .baseUrl(BAES_URL)
                .addConverterFactory(GsonConverterFactory.create())
    }

    val apiService:ApiService by lazy {
        retrofitBuilder
            .build()
            .create(ApiService::class.java)
    }
}