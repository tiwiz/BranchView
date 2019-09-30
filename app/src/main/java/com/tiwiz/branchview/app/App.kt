package com.tiwiz.branchview.app

import android.app.Application
import com.thesaurus.branchview.BranchIndicator

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        BranchIndicator.attachTo(this, "BranchView")
    }
}