package com.sourabh_projects.easynews.screen.search

import android.view.SearchEvent

sealed class SeachEvent {

   data class UpdateSearchQuery(val searchQuery: String) : SearchEvent()

   object SearchNews : SearchEvent()

}