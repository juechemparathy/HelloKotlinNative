package mobile.android.hellokotlinnative

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import shared.hellokotlinnative.GreetingExpectActual
import shared.hellokotlinnative.AndroidSampleInterface

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        expectActual.text = "Expect/Actual: ${GreetingExpectActual().greeting()}"

        sampleInterface.text = AndroidSampleInterface().printHello("Kotlin")
    }
}
