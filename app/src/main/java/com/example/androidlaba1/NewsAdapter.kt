package com.example.androidlaba1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.androidlaba1.databinding.ItemList1Binding
import com.example.androidlaba1.databinding.ItemList2Binding


class NewsAdapter(val listener: Listener) : ListAdapter<NewsModel, RecyclerView.ViewHolder>(MyDiffCallback()) {
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
            0 -> (holder as NewsHolder1).bind(getItem(position), listener)
            else -> (holder as NewsHolder2).bind(getItem(position), listener)

        }
    }


    class NewsHolder1(private val binding: ItemList1Binding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(news: NewsModel, listener: Listener) = with(binding) {
            header.text = news.header
            subHeader.text = news.subhead
            subHeader2.text = news.subhead
            title.text = news.title
            image.setImageResource(news.iconId)
            avatar.setImageResource(news.userAvatarId)
            description.text = news.description

            itemView.setOnClickListener{
                listener.onClick(news)
            }
        }
    }

    class NewsHolder2(private val binding: ItemList2Binding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(news: NewsModel, listener: Listener) = with(binding) {
            header.text = news.header
            subHeader.text = news.subhead
            avatar.setImageResource(news.userAvatarId)
            image.setImageResource(news.icon80dpId)

            itemView.setOnClickListener{
                listener.onClick(news)
            }
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

    interface Listener{
        fun onClick(news: NewsModel)
    }
}


