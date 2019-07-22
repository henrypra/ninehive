package com.example.ninehive.main

import android.support.v7.app.AppCompatActivity

class MainPresenter(val activity: AppCompatActivity,
                    val view: MainContract.View) : MainContract.Presenter {

    private val excRate = 1.12085

    override fun onCalculateClicked(euro: Double?) {
        view.displayResult(euro?.times(excRate))
    }
}