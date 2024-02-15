package com.example.androidtestingapplication1

import android.content.Context

object ResourceComparer {
    fun isEqual(context: Context, resId: Int, string: String): Boolean {
        return string == context.getString(resId)
    }
}