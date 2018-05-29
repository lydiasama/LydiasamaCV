package com.hallelujah.cv.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import com.hallelujah.cv.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnClickProfileAvatar()
    }

    private fun setOnClickProfileAvatar() {
        ivAvatar.setOnClickListener {
            gotoProfileActivity()
        }
    }

    private fun gotoProfileActivity() {
        val intent = Intent(this, PagerActivity::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, ivAvatar, "avatar")
        startActivity(intent, options.toBundle())
    }
}
