package com.example.weatherapp.data

import kotlinx.serialization.Serializable

@Serializable
data class Country(
    val id: Int,
    val name: String,
    val description: String,
    val image: String
)