package ru.sergioozzon.kotlinlearning.simplyweather.data.entity

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Main(
    @SerializedName("temp")
    val temp : Float,
    @SerializedName("pressure")
    val pressure : Float,
    @SerializedName("humidity")
    val humidity : Float,
    @SerializedName("temp_min")
    val tempMin : Float,
    @SerializedName("temp_max")
    val tempMax : Float) : Serializable