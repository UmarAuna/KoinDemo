package com.koin.koindemo.data.model

import com.google.gson.annotations.SerializedName


data class Url(
    @SerializedName("large")
    val large: String,
    @SerializedName("medium")
    val medium: String,
    @SerializedName("small")
    val small: String
)