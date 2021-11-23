package com.dicoding.moviecatalogue.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.dicoding.moviecatalogue.R
import com.dicoding.moviecatalogue.data.ModelTvShow
import com.dicoding.moviecatalogue.databinding.ActivityDetailTvShowBinding
import com.dicoding.moviecatalogue.databinding.ContentDetailTvShowBinding
import com.dicoding.moviecatalogue.viewmodel.DetailTvShowViewModel

class DetailTvShowActivity : AppCompatActivity() {

    private lateinit var contentDetailTvShowBinding: ContentDetailTvShowBinding

    companion object{
        const val EXTRA_TV_SHOW = "extra_tv_show"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val detailTvShowActivity = ActivityDetailTvShowBinding.inflate(layoutInflater)
        contentDetailTvShowBinding = detailTvShowActivity.detailContent

        setContentView(detailTvShowActivity.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        supportActionBar?.title = "Detail Tv Show"

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailTvShowViewModel::class.java]

        val extras = intent.extras
        if (extras != null){
            val tvShowId = extras.getString(EXTRA_TV_SHOW)
            if (tvShowId != null){
                viewModel.setSelectedTvShow(tvShowId)
                detailTvShowContent(viewModel.getTvShow())
            }
        }
    }

    private fun detailTvShowContent(modelTvShow: ModelTvShow) {
        contentDetailTvShowBinding.judulTvShow.text = modelTvShow.judul
        contentDetailTvShowBinding.genreTvShow.text = modelTvShow.genre
        contentDetailTvShowBinding.durationTvShow.text = modelTvShow.duration
        contentDetailTvShowBinding.userScoreTvShow.text = modelTvShow.userScore
        contentDetailTvShowBinding.itemCreatorTvShow.text = modelTvShow.creator
        contentDetailTvShowBinding.itemOverviewTvShow.text = modelTvShow.overview
        Glide.with(this)
            .load(modelTvShow.posterTvShow)
            .transform(RoundedCorners(20))
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                .error(R.drawable.ic_error))
            .into(contentDetailTvShowBinding.posterTvShow)
    }
}