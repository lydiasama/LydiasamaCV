package com.hallelujah.cv.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hallelujah.cv.R
import com.hallelujah.cv.adapter.PageAdapter
import kotlinx.android.synthetic.main.activity_profile.*


class PagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        setOnClickProfileAvatar()
        setupNevigatorBar()
        setupPager()
    }

    private fun setOnClickProfileAvatar() {
        ivAvatar.setOnClickListener {
            supportFinishAfterTransition()
        }
    }

    private fun setupNevigatorBar() {
        bottom_nav_view.enableShiftingMode(false)
        bottom_nav_view.setupWithViewPager(pager)
    }

    private fun setupPager() {
        val adapter = PageAdapter(supportFragmentManager)
        pager.adapter = adapter
        pager.offscreenPageLimit =  bottom_nav_view.itemCount
    }
}
