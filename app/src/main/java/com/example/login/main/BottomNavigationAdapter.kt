package com.example.login.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.login.beranda.BerandaFragment
import com.example.login.profile.ProfilFragment

class BottomNavigationAdapter(fragment : FragmentManager) : FragmentStatePagerAdapter(fragment, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    val fragment = arrayOf(BerandaFragment(null), ProfilFragment(null))

    override fun getCount(): Int = fragment.size

    override fun getItem(position: Int): Fragment {
return fragment[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
       return when(position){
            0 -> "beranda"
           1 -> "Profil"
           else -> ""
       }
    }
}