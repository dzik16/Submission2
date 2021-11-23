package com.dicoding.moviecatalogue.viewmodel

import com.dicoding.moviecatalogue.data.Data
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class DetailTvShowViewModelTest {

    private lateinit var viewModel : DetailTvShowViewModel
    private val data = Data.generateDataTvShow()[0]
    private val tvShowId = data.tvShowId


    @Before
    fun setUp(){
        viewModel = DetailTvShowViewModel()
        viewModel.setSelectedTvShow(tvShowId)
    }

    @Test
    fun getTvShow() {
        viewModel.setSelectedTvShow(data.tvShowId)
        val tvShowEntity = viewModel.getTvShow()
        assertNotNull(tvShowEntity)
        assertEquals(data.tvShowId, tvShowEntity.tvShowId)
        assertEquals(data.posterTvShow, tvShowEntity.posterTvShow)
        assertEquals(data.creator, tvShowEntity.creator)
        assertEquals(data.duration, tvShowEntity.duration)
        assertEquals(data.genre, tvShowEntity.genre)
        assertEquals(data.judul, tvShowEntity.judul)
        assertEquals(data.overview, tvShowEntity.overview)
        assertEquals(data.userScore, tvShowEntity.userScore)
    }
}