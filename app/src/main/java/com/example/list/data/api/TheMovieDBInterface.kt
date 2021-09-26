package com.example.list.data.api

import com.example.list.data.vio.MovieDetails
import com.example.list.data.vio.MovieResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TheMovieDBInterface {

    //https://api.themoviedb.org/3/movie/popular?api_key=b76ff6186734d8fac6139cb8a89b9750
    //https://api.themoviedb.org/3/movie/566525?api_key=b76ff6186734d8fac6139cb8a89b9750
    //https://api.themoviedb.org/3/

    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") id: Int): Single<MovieDetails>

    @GET("movie/popular")
    fun getPopularMovie(@Query("page") page: Int): Single<MovieResponse>

}