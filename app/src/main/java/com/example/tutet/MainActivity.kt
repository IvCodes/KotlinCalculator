package com.example.tutet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.tutet.models.Calculator

class MainActivity : AppCompatActivity() {

    private lateinit var edtnum1:EditText
    private lateinit var edtnum2:EditText

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

         val intent = Intent(this,DisplayActivity::class.java)
         intent.putExtra("Answer",ans)
         startActivity(intent)
         finish()

         Toast.makeText(this, "Answer = $ans" ,Toast.LENGTH_LONG).show()



     }


}