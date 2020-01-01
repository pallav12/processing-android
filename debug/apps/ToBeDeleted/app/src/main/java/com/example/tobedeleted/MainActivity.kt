package com.example.tobedeleted

import android.os.Bundle
import android.content.Intent
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.android.PFragment
import com.core.PApplet


class MainActivity : AppCompatActivity() {
    private var sketch: PApplet? = null

    protected fun onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)
        val frame = FrameLayout(this)
        frame.id = CompatUtils.getUniqueViewId()
        setContentView(
            frame, ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
        )

        sketch = Sketch()
        val fragment = PFragment(sketch)
        fragment.setView(frame, this)
    }

    fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        if (sketch != null) {
            sketch!!.onRequestPermissionsResult(
                requestCode, permissions, grantResults
            )
        }
    }

    fun onNewIntent(intent: Intent) {
        if (sketch != null) {
            sketch!!.onNewIntent(intent)
        }
    }

    fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {
        if (sketch != null) {
            sketch!!.onActivityResult(requestCode, resultCode, data)
        }
    }

    fun onBackPressed() {
        if (sketch != null) {
            sketch!!.onBackPressed()
        }
    }
}
