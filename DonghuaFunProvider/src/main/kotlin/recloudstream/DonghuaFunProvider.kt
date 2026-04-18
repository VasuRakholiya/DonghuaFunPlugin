package recloudstream

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*

class DonghuaFunProvider : MainAPI() {
    override var name = "DonghuaFun"
    override var mainUrl = "https://donghuafun.com"
    override val supportedTypes = setOf(TvType.Anime)
    override var lang = "en"
    override val hasMainPage = true

    override suspend fun search(query: String): List<SearchResponse> {
        return emptyList()
    }
}
