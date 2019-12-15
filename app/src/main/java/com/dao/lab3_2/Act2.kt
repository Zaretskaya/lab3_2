package com.dao.lab3_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_1.button1
import kotlinx.android.synthetic.main.activity_2.*
import android.content.Intent
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView


class Act2 : AppCompatActivity() {
    val TO_SECOND = 0
    val TO_FIRST = 1
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
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        findViewById<Button>(R.id.button1).setOnClickListener {
            this.finish()
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            startActivityForResult(Intent(this, Act3::class.java), TO_SECOND)
        }

        navView = findViewById(R.id.nav_view)
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == TO_FIRST) this.finish()
    }

    override fun onResume() {
        Act_About.text = "This is Activity 2"
        super.onResume()
    }

}