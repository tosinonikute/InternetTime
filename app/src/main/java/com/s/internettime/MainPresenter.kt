package com.s.internettime


import android.util.Log
import com.s.internettime.base.BasePresenter
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*


class MainPresenter() : BasePresenter<MainListView>() {
    private val mainListView: MainListView? = null

    override fun attachView(mainListView: MainListView) {
        super.attachView(mainListView)
    }

    override fun detachView() {
        super.detachView()
    }

    fun getStatus() {
        // parse date

        val start = Date(2018 - 1900, 0,1).format("MMM dd, yyyy")
        val end = Date(2019 - 1900, 0,1).format("MMM dd, yyyy")

        mvpView?.showStatus(start, end)
    }



}