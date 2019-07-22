package ninehive

import android.content.Context
import android.support.v4.app.Fragment

interface BaseView<T : BasePresenter> {

    fun getCurrentContext(): Context?

    var presenter: T?

    val fragment: Fragment

}