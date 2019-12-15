package com.dao.lab3_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView


class Act3 : AppCompatActivity() {

    lateinit var navView: BottomNavigationView

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_about -> {
                startActivity(Intent(applicationContext,Act_About::class.java))
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        val TO_FIRST = 1
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        findViewById<Button>(R.id.button1).setOnClickListener {
            setResult(TO_FIRST)
            this.finish()
        }
        findViewById<Button>(R.id.button2).setOnClickListener { this.finish() }

        navView = findViewById(R.id.nav_view)
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    override fun onResume() {
        Act_About.text = "This is Activity 3"
        super.onResume()
    }

}