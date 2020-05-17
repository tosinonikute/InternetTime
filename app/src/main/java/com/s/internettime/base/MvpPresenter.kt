package com.s.internettime.base


interface MvpPresenter<V : MvpView> {

    fun attachView(mvpView: V)

    fun detachView()
}