package com.wasit.weatherapp.domains

class FutureDomain(
    val day: String,
    val picPath: String,
    val status: String,
    val highTemp: Int,
    val lowTemp: Int
) {
    // No need for explicit getter methods, as properties are public
}
