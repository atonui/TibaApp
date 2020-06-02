package com.example.tibaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_onboarding.*

class OnboardingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        btn_start.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

//        hooks
        val slideAdapter = SlideAdapter(this)
        slider.adapter = slideAdapter

    }
}
