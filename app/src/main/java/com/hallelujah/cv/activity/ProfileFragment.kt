package com.hallelujah.cv.activity


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hallelujah.cv.R
import com.hallelujah.cv.core.CoreUtil
import com.hallelujah.cv.model.ProfileModel

class ProfileFragment : Fragment() {

    companion object {
        fun newInstance(): Fragment {
            return ProfileFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadProfileData()
    }

    private fun loadProfileData() {
        val profileData = CoreUtil().loadJsonData(context, "profile", ProfileModel::class.java)
        Log.d("PROFILE", profileData?.name)
    }

}
