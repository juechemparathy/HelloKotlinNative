package shared.hellokotlinnative


class AndroidSampleInterface : SampleInterface {
    override fun printHello(value: String) : String {
        return "Interface: Hello ${value}  - from Android"
    }
}