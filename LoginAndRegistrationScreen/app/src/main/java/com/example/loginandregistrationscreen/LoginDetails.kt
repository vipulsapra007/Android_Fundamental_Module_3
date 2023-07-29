package com.example.loginandregistrationscreen

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginandregistrationscreen.databinding.ActivityLoginDetailsBinding

class LoginDetails : AppCompatActivity() {

    lateinit var binding: ActivityLoginDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var email=intent.getStringExtra("EMAIL")
        var password=intent.getStringExtra("PASSWORD")


        binding.tvLoginDetail.text="""
            Login Email=$email
            Password   =$password
        """.trimIndent()

    }
}