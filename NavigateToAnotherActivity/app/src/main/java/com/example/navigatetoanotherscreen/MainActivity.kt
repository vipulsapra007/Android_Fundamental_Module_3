package com.example.navigatetoanotherscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigatetoanotherscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnScreen2.setOnClickListener {

            startActivity(Intent(this,SecondScreen::class.java))
        }
        binding.btnScreen3.setOnClickListener {
            startActivity(Intent(this,ThirdScreen::class.java))
        }


    }
}