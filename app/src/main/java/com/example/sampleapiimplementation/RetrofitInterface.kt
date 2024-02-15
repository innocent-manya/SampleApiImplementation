package com.example.sampleapiimplementation

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitInterface {

    @GET("fact")
    fun getListInstance() : Call<DataClass>
}