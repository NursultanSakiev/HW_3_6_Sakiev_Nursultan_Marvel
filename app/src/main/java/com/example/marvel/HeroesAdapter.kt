package com.example.marvel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import java.util.ArrayList

class HeroesAdapter(private val data: ArrayList<Hero>):
    RecyclerView.Adapter<HeroesAdapter.HeroesViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroesViewHolder {
    return HeroesViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_heroes,parent,false))
    }

    override fun onBindViewHolder(holder: HeroesViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int=data.size

  inner  class HeroesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
      private var heroName:TextView?=null
      private lateinit var heroImage: ImageView
      private var heroParent: ConstraintLayout?=null
      fun bind(hero: Hero) {

          heroName=itemView.findViewById(R.id.tv_heroes)
          heroImage=itemView.findViewById(R.id.Image_heroes)
          heroParent=itemView.findViewById(R.id.parent)

          heroName?.text=hero.name
          hero.color?.let { heroParent?.setBackgroundColor(itemView.context.getColor(it)) }
          Glide.with(heroImage).load(hero.image).into(heroImage);
      }
  }

}