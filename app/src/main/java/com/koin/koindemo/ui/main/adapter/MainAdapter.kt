package com.koin.koindemo.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.koin.koindemo.R
import com.koin.koindemo.data.model.Movies
import kotlinx.android.synthetic.main.item_layout.view.*

class MainAdapter(
    private val users: ArrayList<Movies>
): RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(user: Movies){
            itemView.textViewUserName.text = user.name
            itemView.textViewUserEmail.text = user.genre
            itemView.textViewTimeStamp.text = user.timestamp
            Glide.with(itemView.imageViewAvatar.context)
                .load(user.url.large)
                .into(itemView.imageViewAvatar)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_layout,parent,
                false
            )
        )


    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(users[position])

    }

    override fun getItemCount(): Int = users.size

    fun addData(list: List<Movies>){
        users.addAll(list)
    }


}