package com.aperezsi.shared

import android.os.Bundle
import com.aperezsi.commons.contract.MvpContract
import com.aperezsi.commons.view.BaseActivity

class MainActivity : BaseActivity<MainPresenter<MainActivity>>(), MvpContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter?.onAttach(this)
    }
}
