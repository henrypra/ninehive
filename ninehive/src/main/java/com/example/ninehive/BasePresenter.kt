package com.example.ninehive

interface BasePresenter {

    fun onFragmentStart() {
        //Can be overwritten by child class
    }

    fun onFragmentResume() {
        //Can be overwritten by child class
    }

    fun onFragmentPause() {
        //Can be overwritten by child class
    }

    fun onFragmentStop() {
        //Can be overwritten by child class
    }
}