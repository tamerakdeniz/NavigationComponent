package com.example.navigationcomponent.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponent.R
import com.example.navigationcomponent.databinding.FragmentHomePageBinding

class HomePageFragment : Fragment() {
    private lateinit var binding: FragmentHomePageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomePageBinding.inflate(inflater, container, false)

        binding.buttonTransitionA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.pageATransition)
        }

        binding.buttonTransitionX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.pageXTransition)
        }

        return binding.root
    }
}