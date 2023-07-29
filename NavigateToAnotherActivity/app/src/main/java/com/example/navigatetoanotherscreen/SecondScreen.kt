package com.example.navigatetoanotherscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigatetoanotherscreen.databinding.ActivitySecondScreenBinding

class SecondScreen : AppCompatActivity() {

    lateinit var binding: ActivitySecondScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySecondScreenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnNavigateHome.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}