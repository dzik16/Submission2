package com.dicoding.moviecatalogue.viewmodel

import androidx.lifecycle.ViewModel
import com.dicoding.moviecatalogue.data.Data
import com.dicoding.moviecatalogue.data.ModelMovie

class MovieViewModel: ViewModel() {
    fun getMovies() : List<ModelMovie> = Data.generateDataMovie()
}