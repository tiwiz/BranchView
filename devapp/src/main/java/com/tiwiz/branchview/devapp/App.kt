package com.tiwiz.branchview.devapp

import android.app.Application
import com.thesaurus.branchview.BranchIndicator

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        BranchIndicator.attachTo(this, "devapp")
    }
}