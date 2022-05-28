package com.example.hellotoast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
//import android.R
import android.widget.TextView
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {

    private var mCount = 0
    private var mShowCount: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        mShowCount = findViewById<TextView>(R.id.showCount);
    }

    fun showToast(view: View?) {
        val toast: Toast = Toast.makeText(
            this, R.string.toast_message,
            Toast.LENGTH_SHORT
        )
        toast.show()
    }
    fun countUp(view: View?) {
        mCount++
        if (mShowCount != null) { mShowCount?.setText(Integer.toString(mCount)) }
    }
}