package com.koin.koindemo.data.api

import com.koin.koindemo.data.model.Movies
import retrofit2.Response

interface ApiHelper {
    suspend fun getFood(): Response<List<Movies>>
}