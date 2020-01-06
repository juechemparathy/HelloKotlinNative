package shared.hellokotlinnative

// value
expect val isMainThread : Boolean

// function
expect fun platformName() :String

// Class
//expect class HelloClass {
//    fun hello() : String
//}
//
// Object
//expect object HelloObject {
//    fun hello() :String
//}


class GreetingExpectActual {
    fun greeting() : String  = "Hello ${platformName()} + ${printIsMainThread()} "

    fun printIsMainThread() : String = "IsMainThread : ${isMainThread}"
}