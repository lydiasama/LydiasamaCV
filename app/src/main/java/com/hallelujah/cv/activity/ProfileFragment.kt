package com.hallelujah.cv.activity


import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hallelujah.cv.R
import java.io.InputStream

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
        try {
            val inputStream: InputStream = context.assets.open("data/profile.json")
            val inputString = inputStream.bufferedReader().use{it.readText()}
            Log.d("FILE",inputString)
        } catch (e:Exception){
            Log.d("FILE", e.toString())
        }
    }

}
