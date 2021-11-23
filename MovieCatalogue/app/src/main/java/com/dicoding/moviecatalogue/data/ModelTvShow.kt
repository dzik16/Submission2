package com.dicoding.moviecatalogue.data

data class ModelTvShow (
    var tvShowId: String,
    var posterTvShow: Int,
    var judul: String,
    var genre: String,
    var duration: String,
    var creator: String,
    var userScore: String,
//    var bookmarked: Boolean = false,
    var overview: String
)