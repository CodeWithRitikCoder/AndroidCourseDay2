package com.ritikcoder.project2ofandroidcoursewithsaumyasingh_themechangingapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDarkMode= findViewById<Button>(R.id.buttonForDarkMode)
        val buttonReadMode= findViewById<Button>(R.id.buttonForReadMode)
        val linearLayoutThemeChanging= findViewById<LinearLayout>(R.id.linearLayoutForThemeChanging)

        buttonDarkMode.setOnClickListener(){
            linearLayoutThemeChanging.setBackgroundResource(R.color.black)
        }
        buttonReadMode.setOnClickListener(){
            linearLayoutThemeChanging.setBackgroundResource(R.color.readMode)
        }

    }
}