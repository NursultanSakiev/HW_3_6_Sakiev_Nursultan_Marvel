package com.example.marvel

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

fun FragmentActivity.addFragment(fragment: Fragment){
    supportFragmentManager.beginTransaction().add(R.id.container,fragment).commit()
}

fun Fragment.replaceFragment(fragment: Fragment){
    requireActivity().supportFragmentManager.beginTransaction().replace(R.id.container,fragment).addToBackStack("").commit()
}