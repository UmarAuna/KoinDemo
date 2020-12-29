package com.koin.koindemo.data.model

import com.google.gson.annotations.SerializedName


data class Movies(
    @SerializedName("genre")
    val genre: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("timestamp")
    val timestamp: String,
    @SerializedName("url")
    val url: Url
)