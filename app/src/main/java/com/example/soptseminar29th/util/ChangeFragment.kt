package com.example.soptseminar29th.util

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun AppCompatActivity.changeFragment(layoutRes: Int, fragment: Fragment) {
    val transaction = supportFragmentManager.beginTransaction()
    transaction.replace(layoutRes, fragment)
        .addToBackStack(null)
        .commit()
}