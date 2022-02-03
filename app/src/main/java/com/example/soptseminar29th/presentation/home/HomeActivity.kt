package com.example.soptseminar29th.presentation.home

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import com.example.soptseminar29th.R
import com.example.soptseminar29th.databinding.ActivityHomeBinding
import com.example.soptseminar29th.presentation.home.viewmodel.HomeViewModel
import com.example.soptseminar29th.util.BaseViewUtil
import com.example.soptseminar29th.util.changeFragment

class HomeActivity
    : BaseViewUtil.BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
    private val viewModel: HomeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewModel()
    }

    private fun initViewModel() {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        val followerFragment = FollowerFragment()
        val repositstoryFragment = RepositoryFragment()

        supportFragmentManager.beginTransaction().add(R.id.container_rv, followerFragment).commit()
    }

}