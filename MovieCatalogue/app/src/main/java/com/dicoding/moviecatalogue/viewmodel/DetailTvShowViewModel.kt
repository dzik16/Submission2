package com.dicoding.moviecatalogue.viewmodel

import androidx.lifecycle.ViewModel
import com.dicoding.moviecatalogue.data.Data
import com.dicoding.moviecatalogue.data.ModelTvShow

class DetailTvShowViewModel : ViewModel(){
    private lateinit var tvShowId : String

    fun setSelectedTvShow(tvShowId: String){
        this.tvShowId = tvShowId
    }

    fun getTvShow() : ModelTvShow{
        lateinit var tvShow : ModelTvShow
        val tvShowEntities = Data.generateDataTvShow()
        for (tvShowEntity in tvShowEntities){
            if (tvShowEntity.tvShowId == tvShowId){
                tvShow = tvShowEntity
            }
        }
        return tvShow
    }
}