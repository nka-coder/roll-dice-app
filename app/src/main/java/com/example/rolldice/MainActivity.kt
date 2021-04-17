package com.example.rolldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            
            rollDice()
            Toast.makeText(this, "The dice is rolled", Toast.LENGTH_SHORT).show()
        }
        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {
        val randomInt = Random.nextInt(1, 6)

        if (randomInt == 1) {
            diceImage.setImageResource(R.drawable.dice_1)
        }
        if (randomInt == 2) {
            diceImage.setImageResource(R.drawable.dice_2)
        }
        if (randomInt == 3) {
            diceImage.setImageResource(R.drawable.dice_3)
        }
        if (randomInt == 4) {
            diceImage.setImageResource(R.drawable.dice_4)
        }
        if (randomInt == 5) {
            diceImage.setImageResource(R.drawable.dice_5)
        }
        if (randomInt == 6) {
            diceImage.setImageResource(R.drawable.dice_6)
        }
    }
}