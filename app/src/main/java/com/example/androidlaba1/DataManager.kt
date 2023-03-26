package com.example.androidlaba1

interface DataManager {
    public fun getAllNews(): List<NewsModel>
    public fun getNews(id: Int): NewsModel?
}