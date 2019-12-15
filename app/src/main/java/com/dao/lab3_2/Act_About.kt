package com.dao.lab3_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView



class Act_About : AppCompatActivity() {
    companion object {
        var text = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        findViewById<TextView>(R.id.textView1).text = text

    }



}