package com.dicoding.moviecatalogue.viewmodel

import androidx.lifecycle.ViewModel
import com.dicoding.moviecatalogue.data.Data
import com.dicoding.moviecatalogue.data.ModelMovie

class DetailMovieViewModel : ViewModel() {
    private lateinit var movieId : String

    fun setSelectedMovie(movieId: String){
        this.movieId = movieId
    }

    fun getMovie() : ModelMovie{
        lateinit var movie: ModelMovie
        val movieEntities = Data.generateDataMovie()
        for (movieEntity in movieEntities){
            if (movieEntity.movieId == movieId){
                movie = movieEntity
            }
        }
        return movie
    }
}