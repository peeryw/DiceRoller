package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

/**
 * This activity allows users to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }

    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create 2 new Dice objects with 6 sides and roll it
        val dice1 = Dice(6)
        val diceRoll1 = dice1.roll()
        val dice2 = Dice(6)
        val diceRoll2 = dice2.roll()

        // Update the screen with the dice roll
        val resultTextView1: TextView = findViewById(R.id.textView)
        val resultTextView2: TextView = findViewById(R.id.textView2)
        // Change value from Int to String
        resultTextView1.text = diceRoll1.toString()
        resultTextView2.text = diceRoll2.toString()
    }
}

class Dice(private val numSides: Int) {
    // Generate a random number 1 to the value set on numSides
    fun roll(): Int {
        return (1..numSides).random()
    }
}