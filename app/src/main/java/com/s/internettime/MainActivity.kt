package com.s.internettime

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity(), MainListView {

    val presenter : MainPresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.attachView(this)
        presenter.getStatus()
    }

    override fun showStatus(startDate: String, endDate: String){
        Log.d("hello1", "$startDate  $endDate")
    }

    override fun showLoading(){

    }

    override fun hideLoading(){

    }
}
