package com.example

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class TemplatePlugin : Plugin() {
  override fun load(context: Context) {
    // All providers should be added in this manner. Please don't edit the providers list directly.
    //registerMainAPI(ExtensionName())
    //registerMainAPI(ExtensionName2())
  }
}