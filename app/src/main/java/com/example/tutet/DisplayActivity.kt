package com.example.tutet

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.answer_page)


        var txtAnswer = findViewById<TextView>(R.id.textView4)

        txtAnswer.text = intent.getDoubleExtra("Answer",0.0).toString()

        var btnBack:Button = findViewById(R.id.button)

        btnBack.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()

        }



    }
}



