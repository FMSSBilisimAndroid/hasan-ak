package com.hasan.dicegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hasan.dicegame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding //Android's recommended view binding is used

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
   
   //will happen when the button is clicked events
   fun diceRoll(view:View){
        val dice1 = (1..6).random() //Generates random numbers from 1 to 6
        
       //the image corresponding to the randomly generated number is retrieved
        val drawableResourse1 = when(dice1) { 
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }

       binding.imageView.setImageResource(drawableResourse1) //the specified image is displayed in the imageview
       binding.textView.text = "Skor:$dice1" //randomly generated number is shown in textview

       val dice2 = (1..6).random() //Generates random numbers from 1 to 6
       
       //the image corresponding to the randomly generated number is retrieved
       val drawableResourse2 = when(dice2){
           1 -> R.drawable.dice_1
           2 -> R.drawable.dice_2
           3 -> R.drawable.dice_3
           4 -> R.drawable.dice_4
           5 -> R.drawable.dice_5
           else -> R.drawable.dice_6
       }

       binding.imageView2.setImageResource(drawableResourse2) //the specified image is displayed in the imageview 
       binding.textView2.text = "Skor:$dice2" //randomly generated number is shown in textview
    }
}
