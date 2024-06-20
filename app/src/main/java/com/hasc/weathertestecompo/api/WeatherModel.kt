package com.hasc.weathertestecompo.api

import com.hasc.weathertestecompo.api.Current
import com.hasc.weathertestecompo.api.Location

data class WeatherModel(
    val current: Current,
    val location: Location
)