  /*-----------------------------------------------------------.
 /                    CHALLENGE CHAPTER 2                     /
'------------------------------------------------------------/

>>> Program : Layout Aplikasi GoJek dan Tokopedia
>>> Nama    : Hafizh Firdaus Yuspriana
>>> Kelas   : AND - 5

>>> Android Engineering - Binar Academy - MBKM Batch 2

>>> Catatan : Untuk run dapat langsung dijalankan lewat main
------------------------------------------------------------ */

package andlima.hafizhfy.challenge2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gotoGojek : Button = findViewById(R.id.goto_gojek)
        gotoGojek.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, GojekActivity::class.java)
            startActivity(intent)
        })

        val gotoTokopedia : Button = findViewById(R.id.goto_tokopedia)
        gotoTokopedia.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TokopediaActivity::class.java)
            startActivity(intent)
        })

    }
}