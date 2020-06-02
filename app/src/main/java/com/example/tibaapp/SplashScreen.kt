package com.example.tibaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash_screen)

//        define animations
        val top_bottom_animation = AnimationUtils.loadAnimation(this, R.anim.top_bottom_animation)
        val bottom_top_animation = AnimationUtils.loadAnimation(this, R.anim.bottom_to_top)
        val bounce_animation = AnimationUtils.loadAnimation(this, R.anim.bounce_animation)

//        grab id's from the frontend
        img_top_bottom.startAnimation(top_bottom_animation)
        tv_bounce.startAnimation(bounce_animation)
        img_bottom_top.startAnimation(bottom_top_animation)

//        handle splashscreen
        Handler().postDelayed({
            val onboardingScreen = Intent(this, OnboardingActivity::class.java)
            startActivity(onboardingScreen)
            finish()
        }, 3000)

    }
}
