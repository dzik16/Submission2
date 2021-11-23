package com.dicoding.moviecatalogue.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.moviecatalogue.adapter.SectionsPagerAdapter
import com.dicoding.moviecatalogue.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val activitiHomeBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(activitiHomeBinding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        activitiHomeBinding.viewPager.adapter = sectionsPagerAdapter
        activitiHomeBinding.tabs.setupWithViewPager(activitiHomeBinding.viewPager)

        supportActionBar?.elevation = 0f

        supportActionBar?.title = "Catalogue"
    }
}