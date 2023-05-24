package com.example.hw20.ui.home

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.hw20.R
import com.example.hw20.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding
    private val viewModel: HomeViewModel by viewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = DataBindingUtil.bind(view)!!
        binding.lifecycleOwner = viewLifecycleOwner
//        binding.homeViewModel = viewModel

        fun getTopRatedMovies() {
            viewModel.topRatedMovie.observe(viewLifecycleOwner) {
                viewModel.getTopRatedMovies(2)
            }
        }

        fun getPopularMovies() {
            viewModel.popularMovie.observe(viewLifecycleOwner) {
                viewModel.getPopularMovies(3)
            }
        }

        fun getUpComingMovies() {
            viewModel.upComingMovie.observe(viewLifecycleOwner) {
                viewModel.getUpComingMovies(4)
            }
        }
    }
}