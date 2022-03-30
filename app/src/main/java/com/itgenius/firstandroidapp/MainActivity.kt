package com.itgenius.firstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContentView(R.layout.constrain2_layout)

        // ค้นหาตัวแปรจากฝั่ง xml แล้วเก็บลงตัวแปร
        // var tvHello = findViewById<TextView>(R.id.tvHello)
        // tvHello.text = "Welcome to my android app"

    }
}