package com.bor.biencuta.photo.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bor.biencuta.R
import com.squareup.picasso.Picasso
import javax.inject.Inject

class PhotoAdapter: RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {

    private var imageUrls: List<String> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_image, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return imageUrls.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val imageUrl = imageUrls[position]
        holder.bind(imageUrl)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.imageView)

        fun bind(imageUrl: String) {
            // Load image using Picasso
            Picasso.get().load(imageUrl).into(imageView)
        }
    }

    fun setUrlsList(urls: List<String>) {
        imageUrls = urls
        notifyDataSetChanged()
    }
}