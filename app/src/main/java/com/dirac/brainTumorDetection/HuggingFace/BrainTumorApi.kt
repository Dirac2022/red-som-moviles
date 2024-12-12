package com.dirac.brainTumorDetection.HuggingFace

import com.example.mykfirebaserehz.HuggingFace.ResponseData
import retrofit2.Call
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface BrainTumorApi {
    @Multipart
    @POST("/predict/")
    fun predict(@Part request: String): Call<ResponseData>
}