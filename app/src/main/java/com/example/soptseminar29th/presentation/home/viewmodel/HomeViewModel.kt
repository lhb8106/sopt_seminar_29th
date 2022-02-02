package com.example.soptseminar29th.presentation.home.viewmodel

import androidx.lifecycle.ViewModel
import com.example.soptseminar29th.R

class HomeViewModel : ViewModel(){
    val name = "이혜빈"
    val age = "23"
    val mbti = "ESFJ"
    val introduction = "안녕하세여~!".repeat(5)
    val profileImage = R.drawable.ic_launcher_background
}