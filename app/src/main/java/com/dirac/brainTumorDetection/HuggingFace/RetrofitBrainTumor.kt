package com.dirac.brainTumorDetection.HuggingFace

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBrainTumor {
    private const val BASE_URL = "https://raulhuarote-ejemplo.hf.space/"
    val getinstance: BrainTumorApi by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(BrainTumorApi::class.java)
    }
}