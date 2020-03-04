package ru.sergioozzon.kotlinlearning.simplyweather.data.entity

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

class CurrentWeatherRequest(
    @SerializedName("coord") val coord : Coord,
    @SerializedName("weather") val weather: Array<Weather>,
    @SerializedName("base") var base: String,
    @SerializedName("main") val main: Main?,
    @SerializedName("visibility") val visibility: Int,
    @SerializedName("wind") val wind: Wind?,
    @SerializedName("clouds") val clouds: Clouds?,
    @SerializedName("dt") val dt: Long,
    @SerializedName("sys") val sys: Sys?,
    @SerializedName("id") val id: Long,
    @SerializedName("timezone") val timezone: Int,
    @SerializedName("name") val name: String?,
    @SerializedName("cod") val cod: Int,
    @SerializedName("dt_txt") val dt_txt: String?,
    val calendar: Calendar) : Serializable{

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CurrentWeatherRequest

        if (coord != other.coord) return false
        if (!weather.contentEquals(other.weather)) return false
        if (base != other.base) return false
        if (main != other.main) return false
        if (visibility != other.visibility) return false
        if (wind != other.wind) return false
        if (clouds != other.clouds) return false
        if (dt != other.dt) return false
        if (sys != other.sys) return false
        if (id != other.id) return false
        if (timezone != other.timezone) return false
        if (name != other.name) return false
        if (cod != other.cod) return false
        if (dt_txt != other.dt_txt) return false
        if (calendar != other.calendar) return false

        return true
    }

    override fun hashCode(): Int {
        var result = coord.hashCode()
        result = 31 * result + weather.contentHashCode()
        result = 31 * result + base.hashCode()
        result = 31 * result + (main?.hashCode() ?: 0)
        result = 31 * result + visibility
        result = 31 * result + (wind?.hashCode() ?: 0)
        result = 31 * result + (clouds?.hashCode() ?: 0)
        result = 31 * result + dt.hashCode()
        result = 31 * result + (sys?.hashCode() ?: 0)
        result = 31 * result + id.hashCode()
        result = 31 * result + timezone
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + cod
        result = 31 * result + (dt_txt?.hashCode() ?: 0)
        result = 31 * result + calendar.hashCode()
        return result
    }


}