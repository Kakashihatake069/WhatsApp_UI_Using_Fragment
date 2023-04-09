package com.example.tablayoutwhatsappui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class FlashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flash_screen)

        Handler().postDelayed({
            val logo = Intent(this@FlashScreenActivity, MainActivity::class.java)
            startActivity(logo)
            finish()
        }, 4000)
    }
}