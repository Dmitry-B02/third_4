package com.example.second_lab

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import com.example.second_lab.databinding.ActivitySecondBinding

class SecondActivity : AbstractClass() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bnToFirst.setOnClickListener{
            toFirst()
        }
        binding.bnToThird.setOnClickListener{
            toThird()
        }
    }

    private fun toFirst() {
        finish()
    }


    private fun toThird() {
        startActivity(Intent(this, ThirdActivity::class.java))
    }
}