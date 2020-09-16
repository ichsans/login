package com.example.login.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.login.R
import com.example.login.profile.ProfilFragment
import kotlinx.android.synthetic.main.activity_bottom_navigation.*


class BottomNavigationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        loadFragment(FragmentNav())

        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.page_1-> {
                    loadFragment(FragmentNav())
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.page_2-> {
                    loadFragment(FragmentBaru())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.page_3-> {
                    loadFragment(FragmentLagi())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.page_4-> {
                    loadFragment(ProfilFragment(null))
                    return@setOnNavigationItemSelectedListener true
                }

            }
            false
        }
    }



    private fun loadFragment(fragment: Fragment) {
        // load fragment
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }

}
