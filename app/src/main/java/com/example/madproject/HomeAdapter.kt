package com.example.madproject

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HomeAdapter(private val blogList: ArrayList<Model>, val context: Home):
    RecyclerView.Adapter<HomeAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        fun bindItems(model:Model) {
            itemView.findViewById<TextView>(R.id.textView).text = model.title
            itemView.findViewById<TextView>(R.id.textDesc).text = model.desc
            itemView.findViewById<ImageView>(R.id.imageView).setImageResource(model.image)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.record, parent, false)
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.bindItems(blogList[position])

        val model = blogList.get(position)
        var gTitle: String = model.title
        var gdesc: String = model.desc
        var  gImageView: Int = model.image






    }

    override fun getItemCount(): Int {
        return blogList.size
    }



}