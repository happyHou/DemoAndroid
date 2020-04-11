package com.example.mydemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hello.setOnClickListener {
            startActivity(Intent(this@MainActivity, AnimationActivity::class.java))
//            overridePendingTransition(R.anim.slide_enter_bottom,0)
            overridePendingTransition(R.anim.slide_enter_bottom, R.anim.slide_out_top);
        }

    }

}
