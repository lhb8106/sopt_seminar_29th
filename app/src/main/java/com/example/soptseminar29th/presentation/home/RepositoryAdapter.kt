package com.example.soptseminar29th.presentation.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.soptseminar29th.data.FollowerData
import com.example.soptseminar29th.data.RepositoryData
import com.example.soptseminar29th.databinding.ItemFollowerListBinding
import com.example.soptseminar29th.databinding.ItemRepositoryListBinding

class RepositoryAdapter : RecyclerView.Adapter<RepositoryAdapter.RepositoryViewHolder>() {
    private var repositoryData = mutableListOf<RepositoryData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoryViewHolder {
        val binding = ItemRepositoryListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return RepositoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RepositoryAdapter.RepositoryViewHolder, position: Int) {
        holder.onBind(repositoryData[position])
    }

    override fun getItemCount(): Int {
        return repositoryData.size
    }


    class RepositoryViewHolder(val binding : ItemRepositoryListBinding)
        : RecyclerView.ViewHolder(binding.root) {
        fun onBind(repositoryData: RepositoryData) {
            binding.apply{
                repository = repositoryData

                //즉각적 반응 요청
                binding.executePendingBindings()
            }
        }
    }

    fun setRepositoryData(repositoryData: MutableList<RepositoryData>) {
        this.repositoryData = repositoryData
        notifyDataSetChanged()
    }


}