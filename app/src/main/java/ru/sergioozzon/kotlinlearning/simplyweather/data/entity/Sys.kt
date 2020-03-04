package ru.sergioozzon.kotlinlearning.simplyweather.data.entity

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Sys(
    @SerializedName("type")
    var type: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("message")
    val message: Float,
    @SerializedName("country")
    val country: String,
    @SerializedName("sunrise")
    val sunrise: Long,
    @SerializedName("sunset")
    val sunset: Long): Serializable