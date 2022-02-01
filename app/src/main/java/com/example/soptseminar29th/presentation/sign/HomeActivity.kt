package com.example.soptseminar29th.presentation.sign

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.soptseminar29th.R
import com.example.soptseminar29th.databinding.ActivityHomeBinding
import com.example.soptseminar29th.presentation.sign.viewmodel.HomeViewModel
import com.example.soptseminar29th.util.BaseViewUtil

class HomeActivity
    : BaseViewUtil.BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
    private val viewModel: HomeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initBtn()
        initViewModel()
    }

    private fun initViewModel() {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
    private fun initBtn() {
        binding.btnGit.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/lhb8106"))
            startActivity(intent)
        }
    }
}