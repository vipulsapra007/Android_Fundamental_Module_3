package com.example.loginandregistrationscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginandregistrationscreen.databinding.ActivitySignupDetailBinding

class SignupDetail : AppCompatActivity() {
    lateinit var binding: ActivitySignupDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySignupDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var fName=intent.getStringExtra("FNAME")
        var lName=intent.getStringExtra("LNAME")
        var contact=intent.getStringExtra("CONTACT")
        var password=intent.getStringExtra("PASSWORD")
        var gender=intent.getStringExtra("GENDER")
        var email=intent.getStringExtra("EMAIL")


        binding.tvShowData.text="""
            FIRST NAME=$fName
            LAST  NAME=$lName
            EMAIL=$email
            CONTACT=$contact
            PASSWORD=$password
            GENDER=$gender
            
        """.trimIndent()
    }
}