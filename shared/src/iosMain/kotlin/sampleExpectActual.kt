package shared.hellokotlinnative


import platform.Foundation.NSThread
import platform.UIKit.UIDevice

actual val isMainThread : Boolean
            get() = NSThread.isMainThread()

actual fun platformName() : String {
    return "IOS - ${UIDevice.currentDevice.systemName()}"
}