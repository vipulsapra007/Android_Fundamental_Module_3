package com.example.datapassingtoanotherscreen

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.datapassingtoanotherscreen.databinding.ActivityViewDataBinding
import com.example.datapassingtoanotherscreen.models.ItemData

class ViewDataActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewDataBinding
    var data:ItemData?=null

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityViewDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

      data=intent.getParcelableExtra("DATA")

        data?.let {
            binding.tvDetail.text="""
                NAME  =${it.name}
                CITY  =${it.city}
                MOBILE=${it.contact}
                EMAIL =${it.email}
            """.trimIndent()
        }
    }
}