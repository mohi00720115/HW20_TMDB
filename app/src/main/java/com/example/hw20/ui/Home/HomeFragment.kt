package com.example.hw20.ui.Home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.hw20.R
import com.example.hw20.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = DataBindingUtil.bind(view)!!
        binding.lifecycleOwner = viewLifecycleOwner
    }
}