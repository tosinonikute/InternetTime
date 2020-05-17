package com.s.internettime

import com.s.internettime.base.MvpView


interface MainListView : MvpView {

    fun showStatus(startDate: String, endDate: String)

    override fun showLoading()

    override fun hideLoading()

}