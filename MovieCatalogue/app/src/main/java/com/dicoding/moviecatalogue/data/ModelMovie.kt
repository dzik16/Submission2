package com.dicoding.moviecatalogue.data

data class ModelMovie (
    var movieId: String,
    var posterMovie: Int,
    var judul: String,
    var genre: String,
    var duration: String,
    var director: String,
    var userScore: String,
    var overview: String
)