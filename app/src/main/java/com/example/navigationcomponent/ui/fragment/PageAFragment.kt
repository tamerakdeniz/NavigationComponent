package com.example.navigationcomponent.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponent.R
import com.example.navigationcomponent.databinding.FragmentHomePageBinding
import com.example.navigationcomponent.databinding.FragmentPageABinding

class PageAFragment : Fragment() {
    private lateinit var binding: FragmentPageABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPageABinding.inflate(inflater, container, false)

        binding.buttonTransitionB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.pageBTransition)
        }

        return binding.root
    }
}