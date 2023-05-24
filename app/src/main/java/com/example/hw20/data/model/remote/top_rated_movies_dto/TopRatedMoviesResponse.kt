package com.example.hw20.data.model.remote.top_rated_movies_dto


import com.google.gson.annotations.SerializedName

data class TopRatedMoviesResponse(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val topRatedMovies: List<TopRatedMovie>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)