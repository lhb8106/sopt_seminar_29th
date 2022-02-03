package com.example.soptseminar29th.presentation.home

import android.os.Bundle
import androidx.activity.viewModels
import com.example.soptseminar29th.R
import com.example.soptseminar29th.databinding.ActivityHomeBinding
import com.example.soptseminar29th.presentation.home.viewmodel.HomeViewModel
import com.example.soptseminar29th.util.BaseViewUtil

class HomeActivity
    : BaseViewUtil.BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
    private val viewModel: HomeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewModel()
        initViewSetting()
    }

    private fun initViewModel() {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }

    private fun initViewSetting() {
        val followerFragment = FollowerFragment()
        val repositstoryFragment = RepositoryFragment()

        supportFragmentManager.beginTransaction().add(R.id.container_rv, followerFragment).commit()

        binding.tvFollower.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.container_rv, followerFragment).commit()
        }

        binding.tvRepository.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.container_rv, repositstoryFragment).commit()
        }
    }

}