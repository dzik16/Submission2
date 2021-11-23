package com.dicoding.moviecatalogue.viewmodel

import androidx.lifecycle.ViewModel
import com.dicoding.moviecatalogue.data.Data
import com.dicoding.moviecatalogue.data.ModelTvShow

class TvShowViewModel : ViewModel() {
    fun getTvShow() : List<ModelTvShow> = Data.generateDataTvShow()
}