package com.wasit.weatherapp.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wasit.weatherapp.adapters.HourlyAdapter // Fix import statement
import com.wasit.weatherapp.domains.Hourly
import com.wasit.weatherapp.R

class MainActivity : AppCompatActivity() {

    private lateinit var adapterHourly: HourlyAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
    }


    private fun initRecyclerView() {
        val items = ArrayList<Hourly>()

        items.add(Hourly("9 pm", 28, "cloudy"))
        items.add(Hourly("11 pm", 29, "sunny"))
        items.add(Hourly("12 pm", 30, "wind"))
        items.add(Hourly("1 am", 21, "rainy"))
        items.add(Hourly("2 am", 22, "storm"))
        items.add(Hourly("3 pm", 30, "rain"))
        items.add(Hourly("4 am", 21, "snowy"))
        items.add(Hourly("5 am", 22, "cloudy_sunny"))

        recyclerView = findViewById(R.id.view1)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        adapterHourly = HourlyAdapter(items, this)
        recyclerView.adapter = adapterHourly
    }
    fun goToFutureActivity(view: View) {
        val btnNext = findViewById<TextView>(R.id.btn_next)
        btnNext.setOnClickListener {
            val intent = Intent(this, FutureActivity::class.java)
            startActivity(intent)
        }

    }
}
