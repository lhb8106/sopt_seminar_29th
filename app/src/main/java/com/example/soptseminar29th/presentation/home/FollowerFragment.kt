package com.example.soptseminar29th.presentation.home

import android.os.Bundle
import android.view.View
import com.example.soptseminar29th.R
import com.example.soptseminar29th.data.FollowerData
import com.example.soptseminar29th.databinding.FragmentFollowerBinding
import com.example.soptseminar29th.util.BaseViewUtil


class FollowerFragment : BaseViewUtil.BaseFragment<FragmentFollowerBinding>(R.layout.fragment_follower) {
    private lateinit var followerAdapter: FollowerAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAdapter()

    }

    private fun initAdapter() {
        followerAdapter = FollowerAdapter()
        binding.rvFollower.adapter = followerAdapter
        followerAdapter.setFollowerData(
            mutableListOf(
                FollowerData(R.drawable.ic_launcher_foreground, "이혜빈1", "123"),
                FollowerData(R.drawable.ic_launcher_background, "이혜빈2", "1234"),
                FollowerData(R.drawable.ic_launcher_foreground, "이혜빈3", "12345"),

            )
        )
    }

}