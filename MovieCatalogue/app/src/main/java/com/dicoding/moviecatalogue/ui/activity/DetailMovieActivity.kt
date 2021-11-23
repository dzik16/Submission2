package com.dicoding.moviecatalogue.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.dicoding.moviecatalogue.R
import com.dicoding.moviecatalogue.data.ModelMovie
import com.dicoding.moviecatalogue.databinding.ActivityDetailMovieBinding
import com.dicoding.moviecatalogue.databinding.ContentDetailMovieBinding
import com.dicoding.moviecatalogue.viewmodel.DetailMovieViewModel

class DetailMovieActivity : AppCompatActivity() {

    private lateinit var contentDetailMovieActivity: ContentDetailMovieBinding

    companion object{
        const val EXTRA_MOVIE = "extra_course"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val detailMovieActivity = ActivityDetailMovieBinding.inflate(layoutInflater)
        contentDetailMovieActivity = detailMovieActivity.detailContent

        setContentView(detailMovieActivity.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        supportActionBar?.title = "Detail Movie"

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailMovieViewModel::class.java]

        val extras = intent.extras
        if (extras != null){
            val movieId = extras.getString(EXTRA_MOVIE)
            if (movieId != null){
                viewModel.setSelectedMovie(movieId)
                detailMovieContent(viewModel.getMovie())
            }
        }

    }

    private fun detailMovieContent(modelMovie: ModelMovie) {
        contentDetailMovieActivity.judulMovie.text = modelMovie.judul
        contentDetailMovieActivity.genreMovie.text = modelMovie.genre
        contentDetailMovieActivity.durationMovie.text = modelMovie.duration
        contentDetailMovieActivity.userScoreMovie.text = modelMovie.userScore
        contentDetailMovieActivity.itemDirectorMovie.text = modelMovie.director
        contentDetailMovieActivity.itemOverviewMovie.text = modelMovie.overview
        Glide.with(this)
            .load(modelMovie.posterMovie)
            .transform(RoundedCorners(20))
            .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                .error(R.drawable.ic_error))
            .into(contentDetailMovieActivity.posterMovie)
    }
}