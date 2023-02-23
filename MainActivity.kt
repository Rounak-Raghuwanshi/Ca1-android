package com.example.ratingbar

import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rounak.ratingapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submitButton = findViewById<Button>(R.id.button)
        val ratingBar = findViewById<RatingBar>(R.id.ratingbar1)

        submitButton.setOnClickListener(){
            val totalStars = "Total Stars:" + ratingBar.numStars
            val rating = "Rating:: " + ratingBar.rating
            Toast.makeText(this@MainActivity,"""$totalStars$rating""",Toast.LENGTH_LONG).show()
        }


    }
}