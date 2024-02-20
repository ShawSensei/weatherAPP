package com.wasit.weatherapp.domains

class FutureDomain(
    private val day: String,
    private val picPath: String,
    private val status: String,
    private val highTemp: Int,
    private val lowTemp: Int
) {
    // Getter methods for accessing private properties
    fun getDay(): String {
        return day
    }

    fun getPicPath(): String {
        return picPath
    }

    fun getStatus(): String {
        return status
    }

    fun getHighTemp(): Int {
        return highTemp
    }

    fun getLowTemp(): Int {
        return lowTemp
    }
}
