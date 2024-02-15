package com.example.sampleapiimplementation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

//class MainActivityViewModel : ViewModel() {
//
//    private val showText : MutableLiveData<DataClass> = MutableLiveData()
//
//    fun getObservableText() :MutableLiveData<DataClass> {
//        return showText
//    }
//
//    fun getRandomFact() {
//        val retrofit = RetrofitBuilder.getRandomFactInstance().create(RetrofitInterface::class.java)
//        val call = retrofit.getListInstance()
//
//        call.enqueue(object : Callback<DataClass>{
//            override fun onResponse(call: Call<DataClass>, response: Response<DataClass>) {
//                if (response.isSuccessful){
//                    showText.postValue(response.body())
//                }
//            }
//
//            override fun onFailure(call: Call<DataClass>, t: Throwable) {
//                showText.postValue(null)
//            }
//
//        })
//    }
//
//}