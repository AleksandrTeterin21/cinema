package com.example.cinemateterin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class LaunchScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_screen)
        val timer = object: CountDownTimer(3000,1000){
            override fun onTick(p0: Long) {

            }

            override fun onFinish(){
                val intent = Intent(this@LaunchScreen, SignInScreen::class.java)
                startActivity(intent)
                finish()
            }
        }
        timer.start()
    }
}