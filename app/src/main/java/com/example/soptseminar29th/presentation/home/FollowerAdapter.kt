package com.example.soptseminar29th.presentation.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.soptseminar29th.data.FollowerData
import com.example.soptseminar29th.databinding.ItemFollowerListBinding

class FollowerAdapter : RecyclerView.Adapter<FollowerAdapter.FollowerViewHolder>() {
    val userList = mutableListOf<FollowerData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FollowerViewHolder {
        val binding = ItemFollowerListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return FollowerViewHolder(binding)
    }

    override fun onBindViewHolder(holder:FollowerViewHolder, position: Int) {
        holder.onBind(userList[position])
    }

    override fun getItemCount(): Int {
        return userList.size
    }


    class FollowerViewHolder(private val binding : ItemFollowerListBinding)
        :RecyclerView.ViewHolder(binding.root) {
        fun onBind(followerdata: FollowerData) {
            binding.tvFollowerTitle.text = followerdata.name
            binding.tvFollowerSubTitle.text = followerdata.introduction
//            binding.apply{
//                follower = followerdata
//
//                //즉각적 반응 요청
//                binding.executePendingBindings()
//            }
        }
    }
}