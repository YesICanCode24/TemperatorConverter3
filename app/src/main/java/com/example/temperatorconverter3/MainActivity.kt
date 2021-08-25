package com.example.temperatorconverter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val c2f_btn : Button =findViewById(R.id.c2fBtn)
          val f2c_btn : Button =findViewById(R.id.f2c_btn)
        var input_Edt : EditText =findViewById(R.id.input_edt)
         var output_TV : TextView =findViewById(R.id.output_tv)

        c2f_btn.setOnClickListener {

            var celsiusanswer =( input_Edt.text.toString().toLong() * 9/5) + 32
            output_TV.setText(getString(R.string.inputedt,celsiusanswer.toString()))
        }

        f2c_btn.setOnClickListener {
            var farhanswer =( input_Edt.text.toString().toLong()-32)*5/9
            output_TV.setText(getString(R.string.inputedt,farhanswer.toString()))
        }
    }
}