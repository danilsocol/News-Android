package com.example.androidlaba1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.androidlaba1.databinding.ItemList1Binding
import com.example.androidlaba1.databinding.ItemList2Binding


class NewsAdapter() : ListAdapter<NewsModel, RecyclerView.ViewHolder>(MyDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return when (viewType) {
            0 -> {
                val binding = ItemList1Binding.inflate(LayoutInflater.from(parent.context),
                    parent, false)
                NewsHolder1(binding)
            }
            else -> {
                val binding = ItemList2Binding.inflate(LayoutInflater.from(parent.context),
                    parent, false)
                NewsHolder2(binding)
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (getItem(position).viewType) {
            0 -> 0
            else -> 1
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType) {
            0 -> (holder as NewsHolder1).bind(getItem(position))
            else -> (holder as NewsHolder2).bind(getItem(position))

        }
    }


    class NewsHolder1(private val binding: ItemList1Binding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: NewsModel) = with(binding) {
            header.text = item.header
            subHeader.text = item.subhead
            subHeader2.text = item.subhead
            title.text = item.title
            image.setImageResource(item.iconId)
            avatar.setImageResource(item.userAvatarId)
            description.text = item.description
        }
    }

    class NewsHolder2(private val binding: ItemList2Binding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: NewsModel) = with(binding) {
            header.text = item.header
            subHeader.text = item.subhead
            avatar.setImageResource(item.userAvatarId)
            image.setImageResource(item.iconId)
        }
    }

    class MyDiffCallback : DiffUtil.ItemCallback<NewsModel>() {

        override fun areItemsTheSame(oldItem: NewsModel, newItem: NewsModel): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: NewsModel, newItem: NewsModel): Boolean {
            return oldItem == newItem
        }
    }
}


