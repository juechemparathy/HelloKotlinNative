package shared.hellokotlinnative

import android.os.Build
import android.os.Looper

actual val isMainThread: Boolean get() = Looper.getMainLooper() == Looper.myLooper()

actual fun platformName(): String {
    return "Android  ${Build.VERSION.RELEASE}"
}


