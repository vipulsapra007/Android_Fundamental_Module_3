package com.example.fragmenttoactivity

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.fragmenttoactivity.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentSecondBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSecondActivity.setOnClickListener {

            var intent=Intent(requireActivity(),SecondActivity::class.java)
            startActivity(intent)

        }

        binding.btnHomeFragment.setOnClickListener {
            var fragment=HomeFragment()
            var manager:FragmentManager=requireActivity().supportFragmentManager
            var transaction:FragmentTransaction=manager.beginTransaction()
            transaction.replace(R.id.fragment_container,fragment)
            transaction.commit()
        }
    }






}