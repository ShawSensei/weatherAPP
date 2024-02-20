package com.wasit.weatherapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.wasit.weatherapp.domains.Hourly
import com.wasit.weatherapp.R

class HourlyAdapter(private val hourlyList: ArrayList<Hourly>, private val context: Context) : RecyclerView.Adapter<HourlyAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val hourTxt: TextView = itemView.findViewById(R.id.hourTxt)
        val tempTxt: TextView = itemView.findViewById(R.id.tempTxt)
        val pic: ImageView = itemView.findViewById(R.id.pic)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflate = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_hourly, parent, false)
        return ViewHolder(inflate)
    }

    override fun getItemCount(): Int {
        return hourlyList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val hourly = hourlyList[position]
        holder.hourTxt.text = hourly.hour
        holder.tempTxt.text = "${hourly.temp}°"
        val drawableResourceId = context.resources.getIdentifier(hourly.picPath, "drawable", context.packageName)

        Glide.with(context)
            .load(drawableResourceId)
            .into(holder.pic)
    }
}
