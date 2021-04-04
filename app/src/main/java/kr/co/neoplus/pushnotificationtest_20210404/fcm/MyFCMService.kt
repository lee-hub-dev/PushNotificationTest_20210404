package kr.co.neoplus.pushnotificationtest_20210404.fcm

import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Toast
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFCMService: FirebaseMessagingService() {

    override fun onMessageReceived(p0: RemoteMessage) {
        super.onMessageReceived(p0)

//        Log.d("푸시알림-제목", p0.notification!!.title!!)
//        Log.d("푸시알림-내용", p0.notification!!.title!!)

        val myHandler = Handler(Looper.getMainLooper())

        myHandler.post {
            Toast.makeText(applicationContext, p0.notification!!.title!!,Toast.LENGTH_SHORT).show()
        }

    }

}