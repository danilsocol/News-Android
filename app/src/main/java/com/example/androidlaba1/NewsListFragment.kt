package com.example.androidlaba1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidlaba1.databinding.FragmentNewsListBinding


class NewsListFragment : Fragment(), NewsAdapter.Listener {

    private lateinit var binding: FragmentNewsListBinding
    private val newsAdapter = NewsAdapter(this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        init()
        return inflater.inflate(R.layout.fragment_news_list,container,false)
    }

    private fun init(){

        val list  = listOf(
            NewsModel(
                0,R.drawable.avatar, "Header", "Title",
                "Subhead", "description", "text", R.drawable.icon, R.drawable.icon_80dp),
            NewsModel(
                1,R.drawable.avatar, "Header", "Title",
                "Subhead", "description", "text", R.drawable.icon, R.drawable.icon_80dp),
            NewsModel(
                0,R.drawable.avatar, "Header", "Title",
                "Subhead", "description", "text", R.drawable.icon, R.drawable.icon_80dp),
            NewsModel(
                0,R.drawable.avatar, "Header", "Title",
                "Subhead", "description", "text", R.drawable.icon, R.drawable.icon_80dp),
            NewsModel(
                1,R.drawable.avatar, "Header", "Title",
                "Subhead", "description", "text", R.drawable.icon, R.drawable.icon_80dp)
        )
        newsAdapter.submitList(list)

        binding.apply {
            rcView.layoutManager = LinearLayoutManager(context,
                LinearLayoutManager.VERTICAL,false)
            rcView.adapter = newsAdapter
        }
    }

    override fun onClick(news: NewsModel) {

    }
}