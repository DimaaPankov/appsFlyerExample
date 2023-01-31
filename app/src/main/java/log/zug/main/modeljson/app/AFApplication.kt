package log.zug.main.modeljson.app

import android.app.Application
import android.util.Log
import com.appsflyer.AppsFlyerLib
import com.appsflyer.attribution.AppsFlyerRequestListener

class AFApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        AppsFlyerLib.getInstance().init("PicmH3h3wQDHfapGJ69bSb", null, applicationContext)
       // AppsFlyerLib.getInstance().start(this)
        AppsFlyerLib.getInstance().start(applicationContext, "PicmH3h3wQDHfapGJ69bSb", object :
            AppsFlyerRequestListener {
            override fun onSuccess() {
                Log.d("appsFlayer", "Launch sent successfully")
            }

            override fun onError(errorCode: Int, errorDesc: String) {
                Log.d("appsFlayer", "Launch failed to be sent:\n" +
                        "Error code: " + errorCode + "\n"
                        + "Error description: " + errorDesc)
            }
        })
        AppsFlyerLib.getInstance().setDebugLog(true)

    }
}