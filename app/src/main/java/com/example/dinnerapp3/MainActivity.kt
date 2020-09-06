package com.example.dinnerapp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        decide.setOnClickListener {
// Change the Label Text
            food.text = " ${list.random()}!"

        }

        addfood.setOnClickListener{
            val element = newfood.text
            list.add(element.toString())
            newfood.text.clear()
            val builder = AlertDialog.Builder(this@MainActivity)

            // Set the alert dialog title
            builder.setTitle("New food Add")
            builder.setMessage("New food Add")

            // Set a positive button and its click listener on alert dialog
            builder.setPositiveButton("OK"){dialog, which ->
                // Do something when user press the positive button

            }
            val dialog: AlertDialog = builder.create()

            // Display the alert dialog on app interface
            dialog.show()
        }

    }
    val list = arrayListOf( "Hamburger", "Pizza",
            "Mexican", "American", "Chinese")
    }
