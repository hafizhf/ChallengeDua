package andlima.hafizhfy.challenge2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class GojekActivity : AppCompatActivity() {

    var lay_height = 0
    var height = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gojek)

        val resourceId = resources.getIdentifier("status_bar_height", "dimen", "android")
        if (resourceId > 0) {

        }
    }
}