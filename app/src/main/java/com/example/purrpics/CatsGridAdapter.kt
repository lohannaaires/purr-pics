package com.example.purrpics

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_grid.view.*

class CatsGridAdapter (private val catsImages: ArrayList<Int>):
    RecyclerView.Adapter<CatsGridAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.item_grid
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val imageView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_grid, parent, false)

        return MyViewHolder(imageView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        var image = catsImages[position]

        holder.imageView.setImageResource(image)

    }

    override fun getItemCount() = catsImages.size
}