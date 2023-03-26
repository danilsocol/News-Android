package com.example.androidlaba1

class Mock : DataManager {
    private val news = listOf(
        NewsModel.ExpandNewsModel(
            0,0,R.drawable.avatar, "Header", "Title1",
            "Subhead",  "text", R.drawable.icon,"description"),
        NewsModel.CollapseNewsModel(
            1,1,R.drawable.avatar, "Header", "Title2",
            "Subhead", "text", R.drawable.icon, R.drawable.icon_80dp),
        NewsModel.CollapseNewsModel(
            2,1,R.drawable.avatar, "Header", "Title3",
            "Subhead", "text", R.drawable.icon, R.drawable.icon_80dp),
        NewsModel.ExpandNewsModel(
            3,0,R.drawable.avatar, "Header", "Title4",
            "Subhead",  "text", R.drawable.icon,"description"),
        NewsModel.CollapseNewsModel(
            4,1,R.drawable.avatar, "Header", "Title5",
            "Subhead", "text", R.drawable.icon, R.drawable.icon_80dp),

    )
    public override fun getAllNews(): List<NewsModel> {
        return this.news
    }
    public override fun getNews(id: Int?): NewsModel? {
        return this.news.find { it.id == id }
    }
}