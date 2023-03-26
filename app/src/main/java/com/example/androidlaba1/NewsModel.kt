package com.example.androidlaba1

data class NewsModel (
    val id : Int,
    val viewType :Int,
    val userAvatarId : Int,
    val header: String,
    val title: String,
    val subhead: String,
    val description : String,
    val text: String,
    val iconId : Int,
    val icon80dpId: Int){
}