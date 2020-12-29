package com.koin.koindemo.data.api

import com.koin.koindemo.data.model.Movies
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("food")
    suspend fun getFood(): Response<List<Movies>>
}