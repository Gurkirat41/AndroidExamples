package com.ibm.horseswithguns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import android.content.Intent
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1 = findViewById(R.id.icon1) as ImageView
        button1.setOnClickListener{
            val intent = Intent(this, airforce::class.java)

            startActivity(intent)
        }
        val button2 = findViewById(R.id.icon2) as ImageView
        button2.setOnClickListener{
            val intent = Intent(this, army::class.java)

            startActivity(intent)
        }
        val button3 = findViewById(R.id.icon3) as ImageView
        button3.setOnClickListener{
            val intent = Intent(this, navy::class.java)

            startActivity(intent)
        }


    }
}
