package kr.co.neoplus.pushnotificationtest_20210404

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import java.util.concurrent.Delayed

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myHandler = Handler(Looper.getMainLooper())

        myHandler.postDelayed({
            Log.d("디바이스토큰값", FirebaseInstanceId.getInstance().token!!)
        },5000)
    }
}