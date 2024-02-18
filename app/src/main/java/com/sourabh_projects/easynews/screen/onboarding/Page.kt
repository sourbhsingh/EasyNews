package com.sourabh_projects.easynews.screen.onboarding

import androidx.annotation.DrawableRes
import com.sourabh_projects.easynews.R

data class Page(
    val title:String,
    val description : String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Stay informed with EasyNews",
        description = "EasyNews brings you the latest news from around the world in a simple and easy-to-read format.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Customize your news feed",
        description = "EasyNews lets you choose the topics, sources, and languages that interest you the most",
        image = R.drawable.onboarding3
    ),
    Page(
        title = "Best news experience",
        description = "You can also save, share, and comment on the stories you love. Fast, Smooth, and Ad-free news App ",
        image = R.drawable.onboarding1
    )
)
