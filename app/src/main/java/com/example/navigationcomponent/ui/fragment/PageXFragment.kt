package com.example.navigationcomponent.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponent.R
import com.example.navigationcomponent.databinding.FragmentHomePageBinding
import com.example.navigationcomponent.databinding.FragmentPageXBinding

class PageXFragment : Fragment() {
    private lateinit var binding: FragmentPageXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPageXBinding.inflate(inflater, container, false)

        binding.buttonTransitionY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.pageYTransition)
        }

        return binding.root
    }
}