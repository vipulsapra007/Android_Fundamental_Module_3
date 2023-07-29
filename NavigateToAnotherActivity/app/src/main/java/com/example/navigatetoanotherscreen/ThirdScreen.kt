package com.example.navigatetoanotherscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigatetoanotherscreen.databinding.ActivityThirdScreenBinding

class ThirdScreen : AppCompatActivity() {
    lateinit var binding: ActivityThirdScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityThirdScreenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnNavigateHome.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}