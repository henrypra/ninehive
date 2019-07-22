package com.example.ninehive.main

import com.example.ninehive.BasePresenter
import com.example.ninehive.BaseView

interface MainContract {
    interface Presenter : BasePresenter

    interface View : BaseView<Presenter>

}
