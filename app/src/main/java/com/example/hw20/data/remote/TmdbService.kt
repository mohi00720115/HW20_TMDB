package com.example.hw20.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface TmdbService {

    @GET("movie/top_rated")
    suspend fun getTopRatedMovies(@Query("page") page: Int = 1)

    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("page") page: Int = 1)

    @GET("movie/upcoming")
    suspend fun getUpComingMovies(@Query("page") page: Int = 1)
}

//https://api.themoviedb.org/3/movie/top_rated?language=en-US&page=1

//https://api.themoviedb.org/3/movie/popular?language=en-US&page=1

//https://api.themoviedb.org/3/movie/upcoming?language=en-US&page=1