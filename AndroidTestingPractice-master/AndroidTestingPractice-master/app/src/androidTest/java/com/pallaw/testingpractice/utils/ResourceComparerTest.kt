package com.pallaw.testingpractice.utils

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import com.pallaw.testingpractice.R
import org.junit.Test

class ResourceComparerTest(){

    val resourceComparer: ResourceComparer = ResourceComparer()

    @Test
    fun stringResourceSameAsGivenString_returnsTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()

        val result = resourceComparer.isEqual(context, R.string.app_name, "AndroidTestingPractice")

        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse(){
        val context = ApplicationProvider.getApplicationContext<Context>()

        val result = resourceComparer.isEqual(context, R.string.app_name, "BlahBlah")

        assertThat(result).isFalse()
    }
}