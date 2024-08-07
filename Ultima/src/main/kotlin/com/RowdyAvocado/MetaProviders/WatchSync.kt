package com.RowdyAvocado

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.syncproviders.SyncIdName

class WatchSync(val plugin: UltimaPlugin) : MainAPI() {
  override var name = "WatchSync"
  override var mainUrl = "https://anilist.co"
  override var supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie, TvType.OVA)
  override var lang = "en"
  override val supportedSyncNames = setOf(SyncIdName.Anilist)
  override val hasMainPage = true
  private val apiUrl = "https://graphql.anilist.co"

  protected fun Any.toStringData(): String {
    return mapper.writeValueAsString(this)
  }

  override val mainPage = mainPageOf("" to "")

  override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse? {
    return null
  }
}
