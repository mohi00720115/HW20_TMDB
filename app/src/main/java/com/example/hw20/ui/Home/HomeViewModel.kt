package com.example.hw20.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hw20.data.model.remote.popular_mmovies_dto.PopularMovie
import com.example.hw20.data.model.remote.top_rated_movies_dto.TopRatedMovie
import com.example.hw20.data.model.remote.upcoming_movies_dto.UpcomingMovie
import com.example.hw20.data.repository.Repository
import kotlinx.coroutines.launch
import javax.inject.Inject

class HomeViewModel @Inject constructor(private val repository: Repository) : ViewModel() {

    private val _topRateMovie = MutableLiveData<List<TopRatedMovie>>()
    val topRatedMovie: LiveData<List<TopRatedMovie>> = _topRateMovie

    private val _popularMovie = MutableLiveData<List<PopularMovie>>()
    val popularMovie: LiveData<List<PopularMovie>> = _popularMovie

    private val _upComingMovie = MutableLiveData<List<UpcomingMovie>>()
    val upComingMovie: LiveData<List<UpcomingMovie>> = _upComingMovie
    fun getTopRatedMovies(page: Int) {
        viewModelScope.launch {
            _topRateMovie.postValue(repository.getTopRatedMovies(page).topRatedMovies)
        }
    }

    fun getPopularMovies(page: Int) {
        viewModelScope.launch {
            _popularMovie.postValue(repository.getPopularMovies(page).popularMovies)
        }
    }

    fun getUpComingMovies(page: Int) {
        viewModelScope.launch {
            _upComingMovie.postValue(repository.getUpComingMovies(page).upcomingMovies)
        }
    }
}