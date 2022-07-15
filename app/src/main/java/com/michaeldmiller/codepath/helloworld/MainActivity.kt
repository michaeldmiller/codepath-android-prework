package com.michaeldmiller.codepath.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // locate button
        val helloButton = findViewById<Button>(R.id.helloButton)
        // setup on click listener
        helloButton.setOnClickListener{
            // log confirmation of button press
            Log.v("Hello world", "Button clicked!")
            // create toast
            Toast.makeText(this, R.string.hello_message, Toast.LENGTH_SHORT).show()
        }
        // cat image source: https://commons.wikimedia.org/wiki/File:Cat_in_Winter.JPG
    }
}
