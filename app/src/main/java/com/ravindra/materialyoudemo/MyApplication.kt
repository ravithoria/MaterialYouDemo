package com.ravindra.materialyoudemo

import android.app.Application
import com.google.android.material.color.DynamicColors

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // if comment use -> default color
        // if uncomment use android 12 or > -> wallpaper dynamic color
        DynamicColors.applyToActivitiesIfAvailable(this);
    }
}