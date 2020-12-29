package com.koin.koindemo.data.api

import com.koin.koindemo.data.model.Movies
import retrofit2.Response

class ApiHelperImpl(private val apiService: ApiService): ApiHelper {
    override suspend fun getFood(): Response<List<Movies>> = apiService.getFood()

}