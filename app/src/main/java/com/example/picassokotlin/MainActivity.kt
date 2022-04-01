package com.example.picassokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "KotlinApp"
        val imageView: ImageView = findViewById(R.id.image_view)
        val url = "https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__340.jpg"
      //  Picasso.with(this).load(url).into(imageView)
Picasso.with(this).load(url).resize(10,50).centerCrop().into(imageView)


    }
}