package shared.hellokotlinnative

import android.os.Build


class AndroidSampleInterface : SampleInterface {
    override fun printHello(value: String) : String {
        return "Interface: Hello ${value}  - from Android ${Build.VERSION.RELEASE}"
    }
}