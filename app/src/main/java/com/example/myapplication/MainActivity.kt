package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num1: EditText = findViewById(R.id.num1)
        val num2: EditText = findViewById(R.id.num2)
        val ans: TextView = findViewById(R.id.ans)

        val addButton: Button = findViewById(R.id.addition)

        addButton.setOnClickListener {
            val n1 = num1.text.toString().toInt()
            val n2 = num2.text.toString().toInt()
            ans.text = (n1 + n2).toString()
        }



    }







}