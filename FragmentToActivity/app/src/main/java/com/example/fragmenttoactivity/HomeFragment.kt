package com.example.fragmenttoactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.fragmenttoactivity.databinding.FragmentHomeBinding
import kotlin.concurrent.fixedRateTimer


class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding


    override fun onCreateView(


        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNxtFragment.setOnClickListener {

            var fragment = SecondFragment()
            var manager: FragmentManager = requireActivity().supportFragmentManager
            var transaction: FragmentTransaction = manager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)

            transaction.addToBackStack("SECOND")
            transaction.commit()

        }
    }
}





