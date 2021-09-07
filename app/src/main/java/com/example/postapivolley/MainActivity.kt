package com.example.postapivolley

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {


   // val url:String="https://reqres.in/api/users"
    //val url:String="https://projects.vishnusivadas.com/testing/read.php"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView:TextView = findViewById(R.id.text)
// ...

// Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(this)
        val url = "https://projects.vishnusivadas.com/testing/write.php"

// Request a string response from the provided URL.
    val request:StringRequest=object :StringRequest(Method.POST,url,Response.Listener {
        Log.e("respons>>>>>>", it + "")



    },Response.ErrorListener {
    }){
        override fun getParams(): MutableMap<String, String> {
            val params: MutableMap<String, String> = HashMap()

            params["param"]="abc"
            return params


        }

    }
       queue.add(request)
//        textView=findViewById(R.id.text)


//        val request: StringRequest =
//            StringRequest(Request.Method.POST, url, Response.Listener { response ->
//
//                Log.e("respons>>>>>>", response + "")
//            },Response.ErrorListener {
//
//
//            })
//
//
//        val queue : RequestQueue= Volley.newRequestQueue(this)
//        queue.add(request)



    }
}