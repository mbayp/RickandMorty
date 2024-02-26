package com.example.rickandmorty.character

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.rickandmorty.data.model.Result
import com.example.rickandmorty.databinding.ItemMortyBinding

class MainAdapter(
private val list:List<Result>
): RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(ItemMortyBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class MainViewHolder(private val binding:ItemMortyBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(response: Result) {
            binding.tvCharacterName.text=response.name
            binding.tvExistence.text=response.status
            binding.tvSpecies.text=response.species
            binding.tvLocationInfo.text=response.location.name
            Glide.with(binding.imgCharacter).load(response.image).into(binding.imgCharacter)
            Glide.with(binding.imgIndicator).load(response.image).into(binding.imgIndicator)
        }
    }
}