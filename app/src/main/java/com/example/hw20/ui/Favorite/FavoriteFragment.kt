package com.example.hw20.ui.Favorite

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.hw20.R
import com.example.hw20.databinding.FragmentFavoriteBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class FavoriteFragment : Fragment(R.layout.fragment_favorite) {
    private lateinit var binding: FragmentFavoriteBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = DataBindingUtil.bind(view)!!
        binding.lifecycleOwner = viewLifecycleOwner
    }
}