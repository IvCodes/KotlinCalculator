package com.example.tutet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.tutet.models.Calculator

class MainActivity : AppCompatActivity() {

    lateinit var edtnum1:EditText
    lateinit var edtnum2:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtnum1 = findViewById(R.id.edtnum1)
        edtnum2 = findViewById(R.id.edtnum2)


    }

     fun buttonClick(v: View){


         var ans = 0.0

         val calculator = Calculator(edtnum1.text.toString().toDouble(), edtnum2.text.toString().toDouble())

         when(v.id){

             R.id.btnadd -> ans = calculator.add()
             R.id.btnmin -> ans = calculator.subtract()
             R.id.btnmltply -> ans = calculator.multiply()
             R.id.btndiv -> ans = calculator.divide()

         }

         Toast.makeText(this, "Answer = $ans" ,Toast.LENGTH_LONG).show()



     }


}