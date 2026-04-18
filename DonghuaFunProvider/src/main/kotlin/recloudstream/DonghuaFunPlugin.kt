package recloudstream

import android.content.Context
import com.lagradost.cloudstream3.plugins.*

@CloudstreamPlugin
class DonghuaFunPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(DonghuaFunProvider())
    }
}
