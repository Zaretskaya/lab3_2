package com.dao.lab3_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity

class Act1 : AppCompatActivity() {


    lateinit var navView: BottomNavigationView

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_about -> {
            startActivity(Intent(applicationContext,Act_About::class.java))
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)
        findViewById<Button>(R.id.button1).setOnClickListener {
            startActivity(Intent(this, Act2::class.java))
        }
        navView = findViewById(R.id.nav_view)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

    }
    override fun onResume() {
        Act_About.text = "This is Activity 1"
        super.onResume()
    }
}


