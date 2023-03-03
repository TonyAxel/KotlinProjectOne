package com.example.labone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text: TextView = findViewById(R.id.textView) as TextView;


        var button: Button = findViewById(R.id.button) as Button;

        button.setOnClickListener {
            val textInput: EditText = findViewById(R.id.inputText) as EditText;
            text.setText(textInput.text.toString());
        }

    }
}