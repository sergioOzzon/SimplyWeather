package ru.sergioozzon.kotlinlearning.simplyweather.data.entity

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

data class WeatherForecast(
    @SerializedName("dt") val dt: Long,
    @SerializedName("main") val main: Main?,
    @SerializedName("weather") val weather: Array<Weather>,
    @SerializedName("clouds") val clouds: Clouds?,
    @SerializedName("wind") val wind: Wind?,
    @SerializedName("snow")
    val snow: Snow?,
    @SerializedName("sys")
    val sys: Sys?,
    @SerializedName("dt_txt")
    val dt_txt: String?,
    val calendar: Calendar?
) : Serializable{
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as WeatherForecast

        if (main != other.main) return false
        if (!weather.contentEquals(other.weather)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = main?.hashCode() ?: 0
        result = 31 * result + weather.contentHashCode()
        return result
    }
}