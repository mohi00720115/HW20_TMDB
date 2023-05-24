package com.example.hw20.data.repository

import com.example.hw20.data.model.remote.popular_mmovies_dto.PopularMovie
import com.example.hw20.data.model.remote.popular_mmovies_dto.PopularMoviesResponse
import com.example.hw20.data.model.remote.top_rated_movies_dto.TopRatedMovie
import com.example.hw20.data.model.remote.top_rated_movies_dto.TopRatedMoviesResponse
import com.example.hw20.data.model.remote.upcoming_movies_dto.UpcomingMovie
import com.example.hw20.data.model.remote.upcoming_movies_dto.UpcomingMoviesResponse
import com.example.hw20.data.remote.TmdbService
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.withContext
import javax.inject.Inject

class Repository @Inject constructor(private val tmbdService: TmdbService) {

    suspend fun getTopRatedMovies(page: Int): TopRatedMoviesResponse {
        return withContext(IO) { tmbdService.getTopRatedMovies(page) }
    }

    suspend fun getPopularMovies(page: Int): PopularMoviesResponse {
        return withContext(IO) { tmbdService.getPopularMovies(page) }
    }

    suspend fun getUpComingMovies(page: Int): UpcomingMoviesResponse {
        return withContext(IO) { tmbdService.getUpComingMovies(page) }
    }

}