package com.example.ezio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val kutxe = findViewById<BottomNavigationView>(R.id.kutxe)
        val controller = findNavController(R.id.host)
        val fragmentset = setOf<Int>(
            R.id.liverpool,
            R.id.scouser,
            R.id.gamebred

        )

        setupActionBarWithNavController(controller, AppBarConfiguration(fragmentset))
        kutxe.setupWithNavController(controller)
    }
}