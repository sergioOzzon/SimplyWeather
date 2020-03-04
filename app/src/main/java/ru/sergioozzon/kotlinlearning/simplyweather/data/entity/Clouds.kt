package ru.sergioozzon.kotlinlearning.simplyweather.data.entity

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Clouds(
    @SerializedName("all")
    val all: Int) : Serializable