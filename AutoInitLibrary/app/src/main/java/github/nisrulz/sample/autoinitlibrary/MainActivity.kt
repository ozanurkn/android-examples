package github.nisrulz.sample.autoinitlibrary

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import github.nisrulz.sample.awesomelib.AwesomeLib
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get Instance
        val awesomeLib = AwesomeLib.getInstance()

        // Init the Library
        awesomeLib.init(this)

        // Set the textview
        textView.text = awesomeLib.stringData
    }
}
