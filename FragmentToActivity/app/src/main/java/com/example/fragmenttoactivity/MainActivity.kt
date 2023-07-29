package com.example.fragmenttoactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmenttoactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
     binding.btnActivityMove.setOnClickListener {
         startActivity(Intent(this,SecondActivity::class.java))
     }
        var fragment=HomeFragment()
        var manager=supportFragmentManager
        var transaction=manager.beginTransaction()

        transaction.replace(R.id.fragment_container,fragment)
        transaction.commit()



    }
}