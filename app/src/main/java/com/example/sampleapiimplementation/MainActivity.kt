package com.example.sampleapiimplementation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var showText : TextView
    lateinit var nextBtn : Button
//    lateinit var mainActivityViewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showText= findViewById(R.id.tv_showText)
        nextBtn = findViewById(R.id.btn_next)

//        mainActivityViewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
//        mainActivityViewModel.getRandomFact()


//        getViewModelMethod()



        getApiMethod()
//
//        nextBtn.setOnClickListener {
//            mainActivityViewModel.getRandomFact()
//        }

    nextBtn.setOnClickListener {
        getApiMethod()
    }
    }

//    private fun getViewModelMethod() {
//        mainActivityViewModel.getObservableText().observe(this, Observer {
//            if (it !=null){
//                showText.text = it.fact
//            }
//        })
//    }


    /////////// WithoutView Model code
    private fun getApiMethod() {
        val call = RetrofitBuilder.apiService.getListInstance()

        call.enqueue(object : Callback<DataClass>{
            override fun onResponse(
                call: Call<DataClass>,
                response: Response<DataClass>
            ) {
                if (response.isSuccessful){
                    val response: DataClass? = response.body()
                    showText.text = response?.fact
                }
                Log.d("Response : ", response.body().toString())
            }

            override fun onFailure(call: Call<DataClass>, t: Throwable) {
                Log.d("Response : ", t.toString())
            }

        })
    }
}