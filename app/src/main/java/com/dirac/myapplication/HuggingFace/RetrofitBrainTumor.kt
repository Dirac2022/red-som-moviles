package com.dirac.myapplication.HuggingFace

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBrainTumor {
    private const val BASE_URL = "https://raulhuarote-ejemplo.hf.space/"
    val getinstance: HuellaApi by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(HuellaApi::class.java)
    }
}