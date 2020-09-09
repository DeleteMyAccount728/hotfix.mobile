package com.travels.searchtravels

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.api.services.vision.v1.model.LatLng
import com.preview.planner.prefs.AppPreferences.getToken
import com.travels.searchtravels.api.OnVisionApiListener
import com.travels.searchtravels.api.VisionApi
import com.travels.searchtravels.utils.ImageHelper
import org.junit.Test


class CategoryUnitTest {
    private val seaPath = "sea.jpg"
    private val beachPath = "beach.jpg"
    private val mountainPath = "mountain.jpg"
    private val snowPath = "snow.jpg"
    private val oceanPath = "ocean.jpg"

    @Test
    fun testSeaCategory_isCorrect() {
        val testContext = ApplicationProvider.getApplicationContext<Context>()
        val token = getToken(testContext)
        val bitmap = ImageHelper.getBitmapFromPath(seaPath)
        val resizedBitmap = ImageHelper.resizeBitmap(bitmap)
        VisionApi.findLocation(
            resizedBitmap,
            token,
            object : OnVisionApiListener {

                override fun onSuccess(latLng: LatLng) {
                    assert(false)
                }

                override fun onErrorPlace(category: String) {
                    assert(category == "sea")
                }

                override fun onError() {
                    assert(false)
                }
            })
    }

    @Test
    fun testBeachCategory_isCorrect() {
        val testContext = ApplicationProvider.getApplicationContext<Context>()
        val token = getToken(testContext)
        val bitmap = ImageHelper.getBitmapFromPath(beachPath)
        val resizedBitmap = ImageHelper.resizeBitmap(bitmap)
        VisionApi.findLocation(
            resizedBitmap,
            token,
            object : OnVisionApiListener {

                override fun onSuccess(latLng: LatLng) {
                    assert(false)
                }

                override fun onErrorPlace(category: String) {
                    assert(category == "beach")
                }

                override fun onError() {
                    assert(false)
                }
            })
    }

    @Test
    fun testMountainCategory_isCorrect() {
        val testContext = ApplicationProvider.getApplicationContext<Context>()
        val token = getToken(testContext)
        val bitmap = ImageHelper.getBitmapFromPath(mountainPath)
        val resizedBitmap = ImageHelper.resizeBitmap(bitmap)
        VisionApi.findLocation(
            resizedBitmap,
            token,
            object : OnVisionApiListener {

                override fun onSuccess(latLng: LatLng) {
                    assert(false)
                }

                override fun onErrorPlace(category: String) {
                    assert(category == "mountain")
                }

                override fun onError() {
                    assert(false)
                }
            })
    }

    @Test
    fun testSnowCategory_isCorrect() {
        val testContext = ApplicationProvider.getApplicationContext<Context>()
        val token = getToken(testContext)
        val bitmap = ImageHelper.getBitmapFromPath(snowPath)
        val resizedBitmap = ImageHelper.resizeBitmap(bitmap)
        VisionApi.findLocation(
            resizedBitmap,
            token,
            object : OnVisionApiListener {

                override fun onSuccess(latLng: LatLng) {
                    assert(false)
                }

                override fun onErrorPlace(category: String) {
                    assert(category == "snow")
                }

                override fun onError() {
                    assert(false)
                }
            })
    }

    @Test
    fun testOceanCategory_isCorrect() {
        val testContext = ApplicationProvider.getApplicationContext<Context>()
        val token = getToken(testContext)
        val bitmap = ImageHelper.getBitmapFromPath(oceanPath)
        val resizedBitmap = ImageHelper.resizeBitmap(bitmap)
        VisionApi.findLocation(
            resizedBitmap,
            token,
            object : OnVisionApiListener {

                override fun onSuccess(latLng: LatLng) {
                    assert(false)
                }

                override fun onErrorPlace(category: String) {
                    assert(category == "ocean")
                }

                override fun onError() {
                    assert(false)
                }
            })
    }
}
