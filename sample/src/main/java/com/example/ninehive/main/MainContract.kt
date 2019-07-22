package com.example.ninehive.main

import com.example.ninehive.BasePresenter
import com.example.ninehive.BaseView

interface MainContract {
    interface Presenter : BasePresenter {
        fun onCalculateClicked(euro: Double?)
    }

    interface View : BaseView<Presenter> {
        fun displayResult(dollar: Double?)
    }

}
