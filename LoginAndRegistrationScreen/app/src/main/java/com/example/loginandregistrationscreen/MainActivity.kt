package com.example.loginandregistrationscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginandregistrationscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnSignin.setOnClickListener {
            var email=binding.etEmail.text.toString().trim()
            var password=binding.etPassword.text.toString().trim()
            var intent=Intent(this,LoginDetails::class.java)
            intent.putExtra("EMAIL",email)
            intent.putExtra("PASSWORD",password)
            startActivity(intent)
        }

        binding.btnSignup.setOnClickListener {
            startActivity(Intent(this,SignupActivity::class.java))
        }
        binding.tvFpassword.setOnClickListener {
            startActivity(Intent(this,ForgotPassword::class.java))
        }
    }
}