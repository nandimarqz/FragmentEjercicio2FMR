package com.example.fragmentejercicio2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.fragmentejercicio2.databinding.PlaceViewBinding

class PlaceAdapter( val list : List<Place>, val listener : (Place) -> Unit): RecyclerView.Adapter<PlaceAdapter.ViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.place_view, parent , false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])

        val place = list[position]

        holder.itemView.setOnClickListener{

        listener(place)

        }
    }

    override fun getItemCount(): Int = list.size

    class ViewHolder(val view: View): RecyclerView.ViewHolder(view) {

        val binding = PlaceViewBinding.bind(view)

        fun bind(place : Place){

            binding.textView.text = place.name

            Glide.with(binding.imageView).load(place.urlImg).into(binding.imageView)

        }
    }
}