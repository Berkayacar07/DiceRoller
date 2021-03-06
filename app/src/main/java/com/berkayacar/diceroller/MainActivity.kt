package com.berkayacar.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

/**
 * This activity allows the user to roll a dice and view the result on the screen
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button2)
        rollButton.setOnClickListener {
            rollDice()
        }
        rollDice()
    }

    /**
     * Roll the dice and update the screen with the result
     */
    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceRoll2 = dice.roll2()

        val diceImage: ImageView = findViewById(R.id.imageView)
        val diceImage2:ImageView = findViewById(R.id.imageView2)

        val drawableResource = when(diceRoll){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        val drawableResource2 = when(diceRoll2){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage2.setImageResource(drawableResource2)
    }
}

/**
 * Create Dice class and roll function
 */
class Dice(val numSides: Int) {
    //First dice
    fun roll(): Int {
        return (1..numSides).random()
    }
    //Second dice
    fun roll2():Int{
        return(1..numSides).random()
    }
}