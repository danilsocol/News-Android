package com.example.androidlaba1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidlaba1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val newsAdapter = NewsAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init(){

       val list  = listOf(
            NewsModel(
                0,R.drawable.avatar, "Header", "Title",
                "Subhead", "description", "text", R.drawable.icon),
           NewsModel(
               1,R.drawable.avatar, "Header", "Title",
               "Subhead", "description", "text", R.drawable.icon),
            NewsModel(
                0,R.drawable.avatar, "Header", "Title",
                "Subhead", "description", "text", R.drawable.icon),
            NewsModel(
                0,R.drawable.avatar, "Header", "Title",
                "Subhead", "description", "text", R.drawable.icon),
           NewsModel(
                    1,R.drawable.avatar, "Header", "Title",
           "Subhead", "description", "text", R.drawable.icon)
        )
        newsAdapter.submitList(list)

        binding.apply {
            rcView.layoutManager = LinearLayoutManager(this@MainActivity,
                LinearLayoutManager.VERTICAL,false)
            rcView.adapter = newsAdapter
        }
    }
}