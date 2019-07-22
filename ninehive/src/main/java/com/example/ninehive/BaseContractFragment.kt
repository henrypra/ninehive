package com.example.ninehive

import android.content.Context
import android.os.Bundle
import android.support.annotation.CallSuper
import android.support.annotation.Nullable
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


abstract class BaseContractFragment<T : BasePresenter> : Fragment(), BaseView<T> {

    // As seen here variables need to be initialized when they are created
    // You cannot just write var presenter: T?
    // This is different from java where
    // Basepresenter presenter;
    // would be possible
    override var presenter: T? = null

    override fun getCurrentContext(): Context? {
        return context
    }

    override val fragment: Fragment
        get() = this

    @Nullable
    @Override
    @CallSuper
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        setHasOptionsMenu(true)
        if (presenter == null) {
            throw PresenterNullException(this.javaClass.simpleName)
        }
        return super.onCreateView(inflater, container, savedInstanceState)
    }


    override fun onStart() {
        super.onStart()
        presenter?.onFragmentStart()
    }

    override fun onResume() {
        super.onResume()
        presenter?.onFragmentResume()
    }

    override fun onPause() {
        super.onPause()
        presenter?.onFragmentPause()

    }

    @CallSuper
    override fun onStop() {
        super.onStop()
        presenter?.onFragmentStop()
    }
}