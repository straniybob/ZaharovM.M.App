package com.example.zaharovmmapp

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity()
{


    private var currentColorIndex = 0


    private val colors = listOf(
        Color.RED,
        Color.GREEN,
        Color.parseColor("#FFA500")
    )


    private var currentNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val colorSquare: View = findViewById(R.id.colorSquare)
        val changeColorButton: Button = findViewById(R.id.changeColorButton)
        val numberField: EditText = findViewById(R.id.numberField)
        val changeNumberButton: Button = findViewById(R.id.changeNumberButton)


        changeColorButton.setOnClickListener {
            currentColorIndex = (currentColorIndex + 1) % colors.size
            colorSquare.setBackgroundColor(colors[currentColorIndex])
        }

        changeNumberButton.setOnClickListener {
            currentNumber = (currentNumber + 1) % 8
            numberField.setText(currentNumber.toString())
        }
    }
}