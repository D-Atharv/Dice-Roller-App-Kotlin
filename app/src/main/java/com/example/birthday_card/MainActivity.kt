package com.example.birthday_card

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView // a promise that diceImage is not null and we will make sure that it wont be null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.roll_button)
        rollButton.text = "Click To Roll"

//        var car: Int? = null

        //event listener when button is clicked
//        rollButton.setOnClickListener {
//            Toast.makeText(this,"Button Clicked",Toast.LENGTH_LONG).show()
//        }

//        rollButton.setOnClickListener {
//            rollDice()
//        }

        //MERGING BOTH THE EVENT LISTENERS
        rollButton.setOnClickListener {
            Toast.makeText(this,"Button Clicked",Toast.LENGTH_SHORT).show()
            rollDice()
        }

        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {
        val randomInt = Random.nextInt(6) + 1

        val drawableResource = when(randomInt)
        {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
//        val diceImage: ImageView = findViewById(R.id.dice_image)
//we wont use diceImage variable since it uses memory again and again when function is called.
//Instead we will assign variable once it in the above function

        diceImage.setImageResource(drawableResource)
    }

    //function to generate random integers numbers
//    private fun rollDice() {
//        val resultText: TextView = findViewById(R.id.result_text)
//
//        val randomInt= Random.nextInt(6) + 1
//        resultText.text = randomInt.toString()
//    }

}