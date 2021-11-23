package com.dicoding.moviecatalogue.viewmodel

import com.dicoding.moviecatalogue.data.Data
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class DetailMovieViewModelTest {

    private lateinit var viewModel : DetailMovieViewModel
    private val data = Data.generateDataMovie()[0]
    private val movieId = data.movieId

    @Before
    fun setUp(){
        viewModel = DetailMovieViewModel()
        viewModel.setSelectedMovie(movieId)
    }

    @Test
    fun getMovie() {
        viewModel.setSelectedMovie(data.movieId)
        val movieEntity = viewModel.getMovie()
        assertNotNull(movieEntity)
        assertEquals(data.movieId, movieEntity.movieId)
        assertEquals(data.posterMovie, movieEntity.posterMovie)
        assertEquals(data.director, movieEntity.director)
        assertEquals(data.duration, movieEntity.duration)
        assertEquals(data.genre, movieEntity.genre)
        assertEquals(data.judul, movieEntity.judul)
        assertEquals(data.overview, movieEntity.overview)
        assertEquals(data.userScore, movieEntity.userScore)
    }
}