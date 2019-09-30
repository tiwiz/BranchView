package com.tiwiz.branchview.devapp

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.thesaurus.branchview.Configuration
import com.thesaurus.branchview.ConfigurationProvider
import com.thesaurus.branchview.MessageProvider

class Main2Activity : AppCompatActivity(), ConfigurationProvider, MessageProvider {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    override fun provideConfiguration(): Configuration =
        Configuration(
            textColor = Color.GREEN,
            backgroundColor = Color.BLUE
        )

    override fun provideMessage(): String = "Another message"
}
