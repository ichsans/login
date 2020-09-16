package com.example.login.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.login.R
import com.example.login.databinding.ActivityMainHomeBinding

class MainHomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainHomeBinding
    private lateinit var pagerAdapter: BottomNavigationAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main_home)

        pagerAdapter = BottomNavigationAdapter(supportFragmentManager)
        binding.viewPager.adapter = pagerAdapter

        binding.bottomNavigation.setupWithViewPager(binding.viewPager)

        binding.btnpindah.setOnClickListener {
            startActivity(Intent(this, BottomNavigationActivity::class.java))
        }

    }

}


