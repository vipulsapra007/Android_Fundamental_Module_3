package com.example.changebackgroundonbuttonclick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.changebackgroundonbuttonclick.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.btnRed.setOnClickListener {
            binding.RelativeLayout.setBackgroundResource(R.color.red)
        }
        binding.btnYellow.setOnClickListener {
            binding.RelativeLayout.setBackgroundResource(R.color.yellow)
        }
        binding.btnBlue.setOnClickListener {
            binding.RelativeLayout.setBackgroundResource(R.color.blue)
        }
        binding.btnBrown.setOnClickListener {
            binding.RelativeLayout.setBackgroundResource(R.color.brown)
        }
        binding.btnRandomColor.setOnClickListener {
            binding.RelativeLayout.setBackgroundResource(RandomColor())
        }
    }

    private fun RandomColor(): Int {

        var red=R.color.red
        var yellow=R.color.yellow
        var blue=R.color.blue
        var brown=R.color.brown
        var colorList= mutableListOf(red,yellow,blue,brown)

        return colorList.shuffled().last()


    }
}