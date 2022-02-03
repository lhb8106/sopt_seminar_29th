package com.example.soptseminar29th.presentation.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.soptseminar29th.data.FollowerData
import com.example.soptseminar29th.databinding.ItemFollowerListBinding

class FollowerAdapter : RecyclerView.Adapter<FollowerAdapter.FollowerViewHolder>() {
    private var followerData = mutableListOf<FollowerData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FollowerViewHolder {
        val binding = ItemFollowerListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return FollowerViewHolder(binding)
    }

    override fun onBindViewHolder(holder:FollowerViewHolder, position: Int) {
        holder.onBind(followerData[position])
    }

    override fun getItemCount(): Int {
        return followerData.size
    }


    class FollowerViewHolder(val binding : ItemFollowerListBinding)
        :RecyclerView.ViewHolder(binding.root) {
        fun onBind(followerData: FollowerData) {
            binding.apply{
                follower = followerData

                //즉각적 반응 요청
                binding.executePendingBindings()
            }
        }
    }

    fun setFollowerData(followerData: MutableList<FollowerData>) {
        this.followerData = followerData
        notifyDataSetChanged()
    }

}