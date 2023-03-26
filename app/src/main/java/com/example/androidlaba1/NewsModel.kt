package com.example.androidlaba1

sealed class NewsModel (
    val id : Int,
    val viewType :Int,
    val userAvatarId : Int,
    val header: String,
    val title: String,
    val subhead: String,
    val text: String,
    val iconId : Int){

     class CollapseNewsModel (id: Int,
                              viewType: Int,
                              userAvatarId: Int,
                              header: String,
                              title: String,
                              subhead: String,
                              text: String,
                              iconId: Int,
                              val icon80dpId: Int,
                              ) : NewsModel(id, viewType, userAvatarId, header, title, subhead, text, iconId)

    class ExpandNewsModel(  id: Int,
                               viewType: Int,
                               userAvatarId: Int,
                               header: String,
                               title: String,
                               subhead: String,
                               text: String,
                               iconId: Int,
                            val description : String

    ) : NewsModel(id, viewType, userAvatarId, header, title, subhead, text, iconId)

}