package com.sourabh_projects.easynews.data.manager.remote.dto

import com.sourabh_projects.easynews.domain.manager.models.Article

data class NewsResponseX(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)