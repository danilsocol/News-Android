package com.example.androidlaba1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidlaba1.databinding.FragmentNewsListBinding


class NewsListFragment : Fragment(), NewsAdapter.Listener {

    private var _binding: FragmentNewsListBinding? = null
    private val newsAdapter = NewsAdapter(this)
    private val apiManager:DataManager = Mock()


    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        _binding = FragmentNewsListBinding.inflate(inflater, container, false)

        init()
        return binding.root
    }

    private fun init(){

        val list = apiManager.getAllNews()
        newsAdapter.submitList(list)

        binding.apply {
            rcView.layoutManager = LinearLayoutManager(context,
                LinearLayoutManager.VERTICAL,false)
            rcView.adapter = newsAdapter
        }
    }

    override fun onClick(news: NewsModel) {
        val bundle = Bundle()
        bundle.apply {
            putInt("id",news.id)
        }

        findNavController().navigate(R.id.toItemCard,bundle)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}