package com.michaeldmiller.codepath.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var helloToastText = "Hello to you too!";

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
            Toast.makeText(this, helloToastText, Toast.LENGTH_SHORT).show()
        }
        // setup listener on name reader, update the toast on click
        val nameInput = findViewById<EditText>(R.id.editTextPersonGreetName)
        nameInput.setOnClickListener {
            updateToast()
        }
        // cat image source: https://commons.wikimedia.org/wiki/File:Cat_in_Winter.JPG
    }

    private fun updateToast() {
        Log.v("Confirmation", "Function was called")
        // get text from field
        val userNameEditor = findViewById<EditText>(R.id.editTextPersonGreetName);
        val userName = userNameEditor.text;
        // if the text is the default prompt or an empty string, display default text,
        // otherwise update the toast text to include the user's name
        if (userName.toString() != "Name Here" && userName.toString() != ""){
            helloToastText = "Hello to you too, $userName!";
        }else {
            helloToastText = "Hello to you too!"
        }
    }
}
