package com.wasit.weatherapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wasit.weatherapp.R
import com.wasit.weatherapp.adapters.FutureAdapter
import com.wasit.weatherapp.domains.FutureDomain

class FutureActivity : AppCompatActivity() {

    private lateinit var adapterTomorrow: FutureAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_future)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        val items = ArrayList<FutureDomain>()
        items.add(FutureDomain("Saturday", "storm", "Storm", 25, 10))
        items.add(FutureDomain("Sunday", "cloudy", "Cloudy", 20, 8))
        items.add(FutureDomain("Monday", "windy", "Windy", 15, 10))
        items.add(FutureDomain("Tuesday", "cloudy_sunny", "Cloudy sunny", 30, 18))
        items.add(FutureDomain("Wednesday", "sunny", "Sunny", 28, 12))
        items.add(FutureDomain("Thursday", "rainy", "Rainy", 11, 15))
        items.add(FutureDomain("Friday", "snowy", "Snowy", 21, 17))
        items.add(FutureDomain("Saturday", "storm", "Storm", 25, 10))
        items.add(FutureDomain("Sunday", "cloudy", "Cloudy", 20, 8))
        items.add(FutureDomain("Monday", "windy", "Windy", 15, 10))
        items.add(FutureDomain("Tuesday", "cloudy_sunny", "Cloudy sunny", 30, 18))
        items.add(FutureDomain("Wednesday", "sunny", "Sunny", 28, 12))
        items.add(FutureDomain("Thursday", "rainy", "Rainy", 11, 15))
        items.add(FutureDomain("Friday", "snowy", "Snowy", 21, 17))


        recyclerView = findViewById(R.id.view2)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        adapterTomorrow = FutureAdapter(items, this)
        recyclerView.adapter = adapterTomorrow
    }

    fun goToMainActivity(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
