package com.example.androidlaba1

class Mock : DataManager {
    private val news = listOf(
        NewsModel(
            0,0,R.drawable.avatar, "Header", "Title",
            "Subhead", "description", "text", R.drawable.icon, R.drawable.icon_80dp),
        NewsModel(
            1,1,R.drawable.avatar, "Header", "Title",
            "Subhead", "description", "text", R.drawable.icon, R.drawable.icon_80dp),
        NewsModel(
            2,0,R.drawable.avatar, "Header", "Title",
            "Subhead", "description", "text", R.drawable.icon, R.drawable.icon_80dp),
        NewsModel(
            3,0,R.drawable.avatar, "Header", "Title",
            "Subhead", "description", "text", R.drawable.icon, R.drawable.icon_80dp),
        NewsModel(
            4,1,R.drawable.avatar, "Header", "Title",
            "Subhead", "description", "text", R.drawable.icon, R.drawable.icon_80dp)
    )
    public override fun getAllNews(): List<NewsModel> {
        return this.news
    }
    public override fun getNews(id: Int): NewsModel? {
        return this.news.find { it.id == id }
    }
}