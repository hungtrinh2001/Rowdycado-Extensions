package com.RowdyAvocado

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class AppAudiobookPlugin : Plugin() {
  override fun load(context: Context) {
    registerMainAPI(AppAudiobook())
  }
}
