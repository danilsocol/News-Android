package com.example.androidlaba1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView


class NewsAdapter() : ListAdapter<NewsModel, NewsAdapter.NewsHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.list_item, parent, false)
        return NewsHolder(itemView)
    }

    override fun onBindViewHolder(holder: NewsHolder, position: Int) {
        val item = currentList[position]
        holder.bind(item)
    }

    class NewsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textView: TextView = itemView.findViewById(R.id.text_view)

        fun bind(item: String) {
            textView.text = item
        }
    }

}