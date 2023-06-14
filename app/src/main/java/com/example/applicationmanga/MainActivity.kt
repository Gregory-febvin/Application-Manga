package com.example.applicationmanga

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextUsername: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonLogin: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextUsername = findViewById(R.id.editTextUsername)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonLogin = findViewById(R.id.buttonLogin)

        buttonLogin.setOnClickListener {
            //val username = editTextUsername.text.toString()
            //val password = editTextPassword.text.toString()

            // Display a popup with the entered username and password
            //showPopup(username, password)

            setContentView(R.layout.activity_second)
        }

    }

    private fun showPopup(username: String, password: String) {
        val message = "Username: $username\nPassword: $password"

        AlertDialog.Builder(this)
            .setTitle("Login Details")
            .setMessage(message)
            .setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }
            .create()
            .show()
    }
}
