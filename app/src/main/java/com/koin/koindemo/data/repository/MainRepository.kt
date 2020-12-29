package com.koin.koindemo.data.repository

import com.koin.koindemo.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper){

    suspend fun getFood() = apiHelper.getFood()
}