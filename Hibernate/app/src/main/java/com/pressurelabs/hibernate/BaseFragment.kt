package com.pressurelabs.hibernate

import android.app.Dialog
import android.os.Bundle
import android.support.v4.app.Fragment
import android.widget.Toast
import com.pressurelabs.hibernate.ui.view.IBaseView
import timber.log.Timber

open class BaseFragment: Fragment(),IBaseView {
    override fun showDialog(dialogToShow: Dialog) {
        dialog=dialogToShow
        dialog?.show()
    }

    override fun dismissDialogs() {
        if (dialog!=null && dialog!!.isShowing) {
            dialog!!.dismiss()
            dialog=null
        }
    }

    override fun toast(msg: String) {
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
    }

    private var dialog:Dialog?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}