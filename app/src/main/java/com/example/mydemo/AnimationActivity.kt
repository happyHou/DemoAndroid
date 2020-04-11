package com.example.mydemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_animation.*

/**
 * 1.设置主题北京为透明，不然可能会后面黑屏
 * 2.overridePendingTransition(0, R.anim.slide_out_top);
 */
class AnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)
        back.setOnClickListener {
            finish()
            overridePendingTransition(0, R.anim.slide_out_top);
        }
    }

    override fun onBackPressed() {
        finish()
        overridePendingTransition(0, R.anim.slide_out_top);
    }
}