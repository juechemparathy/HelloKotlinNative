package shared.hellokotlinnative


import platform.UIKit.UIDevice

actual fun platformName() : String {
    return "IOS - ${UIDevice.currentDevice.systemName()}"
}