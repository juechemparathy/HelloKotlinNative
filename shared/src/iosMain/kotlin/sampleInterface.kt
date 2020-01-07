package shared.hellokotlinnative

import platform.UIKit.UIDevice


class IosSampleInterface : SampleInterface {
    override fun printHello(value: String) : String {
        return "Hello ${value} - from ${UIDevice.currentDevice.systemName()}"
    }
}