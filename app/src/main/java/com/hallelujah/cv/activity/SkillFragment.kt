package com.hallelujah.cv.activity


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.hallelujah.cv.R

class SkillFragment : Fragment() {

    companion object {
        fun newInstance(): Fragment {
            return SkillFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_skill, container, false)
    }


}
