package com.example.mad_23012011162_practical2

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val tag="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        /*fun showmsg(msg: String) {
            Log.i(TAG, "showmsg: $msg")
            Snackbar.make(
                findViewById(R.id.myCoordinatorLayout),
                R.string.email_sent,
                Snackbar.LENGTH_SHORT
            ).show()
        } */
    }

    fun showmsg(msg: String){
        Log.i(tag, "showmsg: $msg")
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()

    }

    override fun onStart() {
        showmsg("onstart method is called")
        super.onStart()
    }

    override fun onResume() {
        showmsg("onresume method is called")
        super.onResume()
    }

    override fun onPause() {
        showmsg("onpause method is called")
        super.onPause()
    }

    override fun onDestroy() {
        showmsg("ondestroy method is called")
        super.onDestroy()
    }

    override fun onStop() {
        showmsg("onstart method is called")
        super.onStop()
    }

    override fun onRestart() {
        showmsg("onrestart method is called")
        super.onRestart()
    }
}
