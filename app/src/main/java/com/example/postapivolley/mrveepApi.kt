package com.example.postapivolley

import android.os.Build.VERSION_CODES.M
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.bumptech.glide.Glide
import org.json.JSONArray
import org.json.JSONObject

class mrveepApi : AppCompatActivity() {
    val url:String="https://mrveep.com/maxgenpost/index.php/welcome/apigetphotos?username=eggeatery"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mrveep_api)
        val textView1:TextView=findViewById(R.id.text1)
        val textView2:TextView=findViewById(R.id.text2)
       // val textView3:TextView=findViewById(R.id.text3)
        val textView4:TextView=findViewById(R.id.text4)
        val textView5:TextView=findViewById(R.id.text5)
        val textView6:TextView=findViewById(R.id.text6)
        val textView7:TextView=findViewById(R.id.text7)
        val textView8:TextView=findViewById(R.id.text8)
        val textView9:TextView=findViewById(R.id.text9)

        val imageView2:ImageView=findViewById(R.id.img2)
        val imageViewbn:ImageView=findViewById(R.id.img)
        val imageView3:ImageView=findViewById(R.id.img3)
        val imageView4:ImageView=findViewById(R.id.img4)
        val imageView5:ImageView=findViewById(R.id.img5)
        val imageView6:ImageView=findViewById(R.id.img6)
        val imageView7:ImageView=findViewById(R.id.img7)
        val imageViewbanner:ImageView=findViewById(R.id.benner)


      val request:StringRequest= StringRequest(Request.Method.GET,url, {
       //Log.e("response>>>>>",it)
      val jsonObject:JSONObject= JSONObject(it)
      val result:String=jsonObject.getString("result")
          textView1.text=result
      val msg:String=jsonObject.getString("msg")
          textView2.text=msg
          val jsonArray:JSONArray=jsonObject.getJSONArray("list")

          val jsonArray2:JSONArray=jsonObject.getJSONArray("banner")

          val hotel:String=jsonObject.getString("hotel")
            textView4.text=hotel
          val address:String=jsonObject.getString("address")
          textView5.text=address
          val state:String=jsonObject.getString("state")
          textView6.text=state
          val mobile:String=jsonObject.getString("mobile")
          textView7.text=mobile
          val email:String=jsonObject.getString("email")
          textView8.text=email
          val trusted:String=jsonObject.getString("trusted")
          textView9.text=trusted
          val jsonArray3:JSONArray=jsonObject.getJSONArray("kyc")

          val banner:String="https://mrveep.com/"+jsonArray2.getString(0)

          val imgkyc1:String="https://mrveep.com/"+jsonArray3.getString(0)
          val imgkyc2:String="https://mrveep.com/"+jsonArray3.getString(1)
          val bsnnerimsg:String= "https://mrveep.com/"+jsonArray.getString(0)
          val image2:String="https://mrveep.com/"+jsonArray.getString(1)
          val image3:String="https://mrveep.com/"+jsonArray.getString(2)
          val image4:String="https://mrveep.com/"+jsonArray.getString(3)
          val image5:String="https://mrveep.com/"+jsonArray.getString(3)
          Glide.with(this).load(bsnnerimsg).into(imageViewbn)
          Glide.with(this).load(image2).into(imageView2)
          Glide.with(this).load(image3).into(imageView3)
          Glide.with(this).load(image4).into(imageView4)
          Glide.with(this).load(image5).into(imageView5)
          Glide.with(this).load(imgkyc1).into(imageView6)
          Glide.with(this).load(imgkyc2).into(imageView7)

          Glide.with(this).load(banner).into(imageViewbanner)



      }, {
         // Log.e("shirin>>>", it.toString())

      })
        val queue: RequestQueue = Volley.newRequestQueue(this)
        queue.add(request)

    }
}