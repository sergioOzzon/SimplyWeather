package ru.sergioozzon.kotlinlearning.simplyweather.data.entity

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Wind(
    @SerializedName("speed") val speed: Float,
    @SerializedName("deg") val deg: Float): Serializable