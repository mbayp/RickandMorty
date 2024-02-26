package com.example.rickandmorty.character

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.rickandmorty.data.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository:Repository): ViewModel() {
    fun getCharacters(): LiveData<com.example.rickandmorty.data.model.Response> = repository.getCharacters()
}