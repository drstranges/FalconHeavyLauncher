package musk.elon.sample

import android.app.Activity
import android.content.Context
import android.os.Bundle
import musk.elon.LaunchPad39A

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    // Falcon Heavy is really heavy, so you can't launch it just from your garden. Prepare it firstly.
    override fun attachBaseContext(newBase: Context) = super.attachBaseContext(LaunchPad39A(newBase))
}
