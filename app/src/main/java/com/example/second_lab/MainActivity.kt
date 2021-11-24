package com.example.second_lab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import com.example.second_lab.databinding.ActivityMainBinding

class MainActivity : AbstractClass() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bnToSecond.setOnClickListener{
            toSecond()
        }
    }

    private fun toSecond() {
        startActivity(Intent(this, SecondActivity::class.java))
    }
}