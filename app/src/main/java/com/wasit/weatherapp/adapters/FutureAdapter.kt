package com.wasit.weatherapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.wasit.weatherapp.R
import com.wasit.weatherapp.domains.FutureDomain

class FutureAdapter(private val futureList: List<FutureDomain>, private val context: Context) : RecyclerView.Adapter<FutureAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dayTxt: TextView = itemView.findViewById(R.id.dayTxt)
        val statusTxt: TextView = itemView.findViewById(R.id.statusTxt)
        val lowTxt: TextView = itemView.findViewById(R.id.lowTxt)
        val highTxt: TextView = itemView.findViewById(R.id.highTxt)
        val pic: ImageView = itemView.findViewById(R.id.pic)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflate = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_future, parent, false)
        return ViewHolder(inflate)
    }

    override fun getItemCount(): Int {
        return futureList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val future = futureList[position]
        holder.dayTxt.text = future.day
        holder.statusTxt.text = future.status
        holder.highTxt.text = "${future.highTemp}°"
        holder.lowTxt.text = "${future.lowTemp}°"
        val drawableResourceId = context.resources.getIdentifier(future.picPath, "drawable", context.packageName)

        Glide.with(context)
            .load(drawableResourceId)
            .into(holder.pic)
    }
}
