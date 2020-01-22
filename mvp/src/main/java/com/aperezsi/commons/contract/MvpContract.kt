package com.aperezsi.commons.contract

interface MvpContract {

    interface View {

    }

    interface Presenter<V: View> {
        fun onAttach(view: V)
        fun detach()
    }
}