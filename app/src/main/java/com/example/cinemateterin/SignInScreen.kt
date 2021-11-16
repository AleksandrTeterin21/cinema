package com.example.cinemateterin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class SignInScreen : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_screen)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
    }

    fun btnstart(view: View) {
        if(email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()){

        }
    }
}