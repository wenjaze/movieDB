package com.example.fragments.movie.network.api

import com.example.fragments.movie.network.models.MovieResponse
import retrofit2.http.GET
import retrofit2.Call
import retrofit2.http.Query

interface MoviePopularApi {
	@GET("movie/popular")
	fun listPopularMovies(
		@Query("api_key") apiKey: String
	): Call<MovieResponse>
}
