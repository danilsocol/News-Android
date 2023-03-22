package com.example.androidlaba1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.androidlaba1.databinding.ItemList1Binding


class NewsAdapter() : ListAdapter<NewsModel, NewsAdapter.NewsHolder>(MyDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.activity_main, parent, false)

        return NewsHolder(itemView)
    }

    override fun onBindViewHolder(holder: NewsHolder, position: Int) {
        val item = currentList[position]
        holder.bind(item)
    }

    class NewsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemList1Binding.bind(itemView)

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

    class MyDiffCallback : DiffUtil.ItemCallback<NewsModel>() {

        override fun areItemsTheSame(oldItem: NewsModel, newItem: NewsModel): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: NewsModel, newItem: NewsModel): Boolean {
            return oldItem == newItem
        }
    }
}


