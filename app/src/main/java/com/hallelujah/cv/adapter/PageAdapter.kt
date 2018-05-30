package com.hallelujah.cv.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.hallelujah.cv.activity.EducationFragment
import com.hallelujah.cv.activity.ProfileFragment
import com.hallelujah.cv.activity.SkillFragment
import com.hallelujah.cv.activity.WorkExperienceFragment

class PageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    companion object {
        private val TOTAL_MENU = 4
    }

    override fun getItem(position: Int): Fragment = when (position) {
        0 -> ProfileFragment.newInstance()
        1 -> EducationFragment.newInstance()
        2 -> SkillFragment.newInstance()
        else -> WorkExperienceFragment.newInstance()
    }

    override fun getCount(): Int {
        return TOTAL_MENU
    }
}