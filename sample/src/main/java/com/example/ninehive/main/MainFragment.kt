package com.example.ninehive.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ninehive.BaseContractFragment
import com.example.ninehive.R
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : BaseContractFragment<MainContract.Presenter>(), MainContract.View, View.OnClickListener {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initOnCLickListeners()
    }

    private fun initOnCLickListeners() {
        btn_calculate?.setOnClickListener(this)
    }

    override fun displayResult(dollar: Double?) {
        tv_result?.text = dollar.toString()
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_calculate -> {
                if (!edt_value_one?.text.isNullOrEmpty()) {
                    presenter?.onCalculateClicked(edt_value_one?.text.toString().toDouble())
                }
            }
        }
    }
}
