package com.example.hw20.data.remote

import com.example.hw20.data.model.remote.popular_mmovies_dto.PopularMoviesResponse
import com.example.hw20.data.model.remote.top_rated_movies_dto.TopRatedMovie
import com.example.hw20.data.model.remote.top_rated_movies_dto.TopRatedMoviesResponse
import com.example.hw20.data.model.remote.upcoming_movies_dto.UpcomingMoviesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface TmdbService {

    @GET("movie/top_rated")
    suspend fun getTopRatedMovies(@Query("page") page: Int = 1) : TopRatedMoviesResponse

    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("page") page: Int = 1) : PopularMoviesResponse

    @GET("movie/upcoming")
    suspend fun getUpComingMovies(@Query("page") page: Int = 1) : UpcomingMoviesResponse
}