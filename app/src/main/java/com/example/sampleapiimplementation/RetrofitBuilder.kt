package com.example.sampleapiimplementation

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/////////// WithoutView Model code

object RetrofitBuilder {

    private val BASE_URL = "https://catfact.ninja/"

    val retrofit : Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

//    object ApiClient {
        val apiService : RetrofitInterface by lazy {
            retrofit.create(RetrofitInterface::class.java)
        }
//    }
}

//class RetrofitBuilder {
//    companion object {
//        val BASE_URL = "https://catfact.ninja/"
//        fun getRandomFactInstance() :  Retrofit{
//            return Retrofit.Builder()
//                .baseUrl(BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build()
//        }
//    }
//}