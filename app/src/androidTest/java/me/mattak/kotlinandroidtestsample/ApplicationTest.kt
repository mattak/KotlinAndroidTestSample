package me.mattak.kotlinandroidtestsample

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import org.junit
import org.junit.runner.RunWith
import kotlin.test.assertEquals

/**
 * ApplicationTest
 */
RunWith(AndroidJUnit4::class)
public class ApplicationTest {
    junit.Before
    public fun setup() {
        // something setup
    }

    junit.After
    public fun teardown() {
        // something teardown
    }

    junit.Test
    public fun packageName() {
        assertEquals(InstrumentationRegistry.getTargetContext().getPackageName(), "me.mattak.kotlinandroidtestsample")
    }
}