package com.dicoding.moviecatalogue.ui.activity

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.dicoding.moviecatalogue.R
import com.dicoding.moviecatalogue.data.Data
import org.junit.Rule
import org.junit.Test

class HomeActivityTest{
    private val dataMovie = Data.generateDataMovie()
    private val dataTvShow = Data.generateDataTvShow()

    @get:Rule
    var activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun loadMovie(){
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        Thread.sleep(2000)
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(10))
        Thread.sleep(2000)
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(1, click()))
        Thread.sleep(2000)
        Espresso.pressBack()
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(5, click()))
        Thread.sleep(2000)
        onView(withId(R.id.judul_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.judul_movie)).check(matches(withText(dataMovie[5].judul)))

        onView(withId(R.id.genre_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.genre_movie)).check(matches(withText(dataMovie[5].genre)))

        onView(withId(R.id.duration_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.duration_movie)).check(matches(withText(dataMovie[5].duration)))

        onView(withId(R.id.user_score_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.user_score_movie)).check(matches(withText(dataMovie[5].userScore)))

        onView(withId(R.id.item_director_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.item_director_movie)).check(matches(withText(dataMovie[5].director)))

        onView(withId(R.id.item_overview_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.item_overview_movie)).check(matches(withText(dataMovie[5].overview)))
    }

    @Test
    fun loadTvShow(){
        onView(withText("TV SHOW")).perform(click())
        Thread.sleep(2000)
        onView(withId(R.id.rv_tvShow)).check(matches(isDisplayed()))
        Thread.sleep(2000)
        onView(withId(R.id.rv_tvShow)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(10))
        Thread.sleep(2000)
        onView(withId(R.id.rv_tvShow)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(1, click()))
        Thread.sleep(2000)
        Espresso.pressBack()
        Thread.sleep(2000)
        onView(withId(R.id.rv_tvShow)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(3, click()))
        Thread.sleep(2000)
        onView(withId(R.id.judul_tv_show)).check(matches(isDisplayed()))
        onView(withId(R.id.judul_tv_show)).check(matches(withText(dataTvShow[3].judul)))

        onView(withId(R.id.genre_tv_show)).check(matches(isDisplayed()))
        onView(withId(R.id.genre_tv_show)).check(matches(withText(dataTvShow[3].genre)))

        onView(withId(R.id.duration_tv_show)).check(matches(isDisplayed()))
        onView(withId(R.id.duration_tv_show)).check(matches(withText(dataTvShow[3].duration)))

        onView(withId(R.id.user_score_tv_show)).check(matches(isDisplayed()))
        onView(withId(R.id.user_score_tv_show)).check(matches(withText(dataTvShow[3].userScore)))

        onView(withId(R.id.item_creator_tv_show)).check(matches(isDisplayed()))
        onView(withId(R.id.item_creator_tv_show)).check(matches(withText(dataTvShow[3].creator)))

        onView(withId(R.id.item_overview_tv_show)).check(matches(isDisplayed()))
        onView(withId(R.id.item_overview_tv_show)).check(matches(withText(dataTvShow[3].overview)))
    }
}