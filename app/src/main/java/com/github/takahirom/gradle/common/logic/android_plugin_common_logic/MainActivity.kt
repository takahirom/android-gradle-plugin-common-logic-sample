package com.github.takahirom.gradle.common.logic.android_plugin_common_logic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.takahirom.gradle.common.logic.library.Library

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(Library.variable)
    }
}