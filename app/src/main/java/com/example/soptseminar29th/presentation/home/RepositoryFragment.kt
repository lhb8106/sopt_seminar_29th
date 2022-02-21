package com.example.soptseminar29th.presentation.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.soptseminar29th.R
import com.example.soptseminar29th.data.FollowerData
import com.example.soptseminar29th.data.RepositoryData
import com.example.soptseminar29th.databinding.FragmentFollowerBinding
import com.example.soptseminar29th.databinding.FragmentRepositoryBinding
import com.example.soptseminar29th.util.BaseViewUtil

class RepositoryFragment :
    BaseViewUtil.BaseFragment<FragmentRepositoryBinding>(R.layout.fragment_repository) {
    private lateinit var repositoryAdapter: RepositoryAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAdapter()

    }

    private fun initAdapter() {
        repositoryAdapter = RepositoryAdapter()
        binding.rvRepository.adapter = repositoryAdapter
        repositoryAdapter.setRepositoryData(
            mutableListOf(
                RepositoryData("이혜빈1", "123"),
                RepositoryData("이혜빈2", "1234"),
                RepositoryData("이혜빈3", "12345"),
            )
        )
    }
}