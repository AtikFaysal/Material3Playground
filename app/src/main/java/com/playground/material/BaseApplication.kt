package com.playground.material

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.iamkamrul.utils.FontsOverride
import com.iamkamrul.utils.FontsOverride.createTypeFace
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        if (BuildConfig.DEBUG)
            Timber.plant(Timber.DebugTree())

        setupFontRes()
    }

    private fun setupFontRes() {
        FontsOverride.regularFontTypeFace =
            createTypeFace(applicationContext, "fonts/Inter-Regular.ttf")
        FontsOverride.mediumFontTypeFace =
            createTypeFace(applicationContext, "fonts/Inter-Medium.ttf")
        FontsOverride.semiBoldFontTypeFace =
            createTypeFace(applicationContext, "fonts/Inter-SemiBold.ttf")
        FontsOverride.boldFontTypeFace =
            createTypeFace(applicationContext, "fonts/Inter-Bold.ttf")
        FontsOverride.italicFontTypeFace =
            createTypeFace(applicationContext, "fonts/Inter-Italic.ttf")
        FontsOverride.setDefaultFont(
            staticTypefaceFieldName = "MONOSPACE",
            typeFace = FontsOverride.regularFontTypeFace)
    }
}