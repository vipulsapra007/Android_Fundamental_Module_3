package com.example.datapassingtoanotherscreen

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.datapassingtoanotherscreen.databinding.ActivityMainBinding
import com.example.datapassingtoanotherscreen.models.ItemData

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            var name=binding.etName.text.toString().trim()
            var mobile=binding.etMobile.text.toString().trim()
            var email=binding.etEmail.text.toString().trim()
            var city=binding.etCity.text.toString().trim()

            var data=ItemData(name,email,mobile,city)

            var intent=Intent(this,ViewDataActivity::class.java)
            intent.putExtra("DATA",data)
            startActivity(intent)


        }



    }
}