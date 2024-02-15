package com.example.androidtestingapplication1

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceComparerTest {

    private val context: Context = ApplicationProvider.getApplicationContext();
    private lateinit var resourceComparer: ResourceComparer

    @Before
    fun setUp() {
        resourceComparer = ResourceComparer
    }

    @After
    fun tearDown() {
    }

    @Test
    fun resourceValueMatchingExpected_isTrue() {
        val result1 = resourceComparer.isEqual(context, R.string.app_name, "Android Testing Application 1")
        val result2 = resourceComparer.isEqual(context, R.string.app_name, "G'Day, m8")

        Truth.assertThat(result1).isTrue();
        Truth.assertThat(result2).isFalse();
    }

}