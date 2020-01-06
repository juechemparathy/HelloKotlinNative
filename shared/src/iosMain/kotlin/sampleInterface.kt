package shared.hellokotlinnative


class IosSampleInterface : SampleInterface {
    override fun printHello(value: String) : String {
        return "Hello ${value} - from IOS"
    }
}