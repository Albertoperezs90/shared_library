package com.aperezsi.commons.presenter

import com.aperezsi.commons.contract.MvpContract

abstract class BasePresenter<V: MvpContract.View> : MvpContract.Presenter<V> {

    protected var view: V? = null

    override fun onAttach(view: V) {
        this.view = view
    }

    override fun detach() {
        this.view = null
    }
}