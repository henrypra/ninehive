package com.example.ninehive

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.ninehive.main.MainFragment
import com.example.ninehive.main.MainPresenter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadMainFragment()
    }

    private fun loadMainFragment() {
        val mainFragment = MainFragment()
        mainFragment.presenter = MainPresenter(this, mainFragment)
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_main_container, mainFragment)
                .commit()

    }
}
