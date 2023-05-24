package com.example.hw20.data.model.remote.upcoming_movies_dto


import com.google.gson.annotations.SerializedName

data class UpcomingMoviesResponse(
    @SerializedName("dates")
    val dates: Dates,
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val upcomingMovies: List<UpcomingMovie>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)