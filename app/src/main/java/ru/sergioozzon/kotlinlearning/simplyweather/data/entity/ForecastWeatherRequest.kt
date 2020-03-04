package ru.sergioozzon.kotlinlearning.simplyweather.data.entity

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ForecastWeatherRequest(
    @SerializedName("list")
    val weatherForecast: ArrayList<WeatherForecast>
) : Serializable {
}