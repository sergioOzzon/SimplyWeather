package ru.sergioozzon.kotlinlearning.simplyweather.ui.home

import androidx.lifecycle.ViewModel

class HomeViewModel<City, HomeViewState>(private val citiesRepository: CitiesRepository) : ViewModel() {

    private val pendingCity: City? =
}