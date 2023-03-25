package com.example.androidlaba1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidlaba1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), NewsAdapter.Listener {

    private lateinit var binding: ActivityMainBinding
    private val newsAdapter = NewsAdapter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    override fun onClick(news: NewsModel) {

    }
}