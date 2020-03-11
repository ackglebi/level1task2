package com.example.trueorfalse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkButton.setOnClickListener {
            checkAnswer()
        }
    }


    /**
     * dit kan echt veel cleaner geschreven worden
     */
    private fun checkAnswer() {
        var correctAnswers = 0

        if(ttInput.text.toString() == "T" || ttInput.text.toString() == "t") {
            correctAnswers++
        }

        if(tfInput.text.toString() == "F" || tfInput.text.toString() == "f") {
            correctAnswers++
        }

        if(ftInput.text.toString() == "F" || ftInput.text.toString() == "f") {
            correctAnswers++
        }

        if(ffInput.text.toString() == "F" || ffInput.text.toString() == "f") {
            correctAnswers++
        }

        Toast.makeText(this, "The correct number of answers is: " + correctAnswers, Toast.LENGTH_SHORT).show()
    }
}
