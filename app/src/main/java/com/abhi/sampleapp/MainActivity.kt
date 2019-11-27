package com.abhi.sampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhi.touchimageview.TouchImageView

class MainActivity : AppCompatActivity() {
    lateinit var touchImageView : TouchImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        touchImageView = findViewById(R.id.touch_imageview)
        //for setting max zoom size. pass float value here
       // touchImageView.setMaxZoom()

    }
}
