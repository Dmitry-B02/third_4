package com.example.second_lab

import android.app.Activity
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import com.example.second_lab.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toFirst.setOnClickListener{
            toFirst()
        }
        binding.toSecond.setOnClickListener{
            toSecond()
        }
        binding.button.setOnClickListener{
            toThird()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.options_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (item.itemId == R.id.about_item) {
            startActivity(Intent(this, AboutActivity::class.java))
            true
        } else
            super.onOptionsItemSelected(item)
    }

    private fun toFirst() {
        val intent = Intent(this, MainActivity::class.java).addFlags(FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
    }

    private fun toSecond() {
        finish()
    }

    private fun toThird() {
        val intent = Intent(this, ThirdActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
        startActivity(intent)
    }
}