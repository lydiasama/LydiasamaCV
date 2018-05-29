package com.hallelujah.cv.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.hallelujah.cv.R
import kotlinx.android.synthetic.main.activity_profile.*

class PagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        setOnClickProfileAvatar()
        setupNevigatorBar()
    }

    private fun setOnClickProfileAvatar() {
        ivAvatar.setOnClickListener {
            supportFinishAfterTransition()
        }
    }

    private fun setupNevigatorBar() {
        bottom_nav_view.enableShiftingMode(false)
    }
}
