package com.hallelujah.cv.core

import android.content.Context
import android.util.Log
import com.google.gson.Gson
import java.io.InputStream

class CoreUtil {

    fun <T>loadJsonData(context: Context, name: String, type: Class<T>) : T? {
        try {
            val fileName = "data/$name.json"
            val inputStream: InputStream = context.assets.open(fileName)
            val inputString = inputStream.bufferedReader().use { it.readText() }
            val jsonObject = Gson().fromJson(inputString, type)
            return jsonObject
        } catch (e: Exception) {
            Log.d("FILE", e.toString())
        }
        return null
    }
}