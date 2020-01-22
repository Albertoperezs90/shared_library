package com.aperezsi.commons.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aperezsi.commons.contract.MvpContract
import javax.inject.Inject

abstract class BaseActivity<P: MvpContract.Presenter<out MvpContract.View>> : AppCompatActivity(), MvpContract.View {

    @Inject
    protected var presenter: P? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}