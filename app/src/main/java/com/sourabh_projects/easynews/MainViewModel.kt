package com.sourabh_projects.easynews

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sourabh_projects.easynews.domain.manager.usecases.AppEntryUseCases
import com.sourabh_projects.easynews.screen.navgraph.Route

import com.sourabh_projects.easynews.screen.navgraph.Route.AppStartNavigation
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject
@HiltViewModel
class MainViewModel @Inject constructor(
    private val appEntryUseCases: AppEntryUseCases
) : ViewModel(){

    var splashCondition by mutableStateOf(true)
        private set
    var startDestination: String by mutableStateOf(AppStartNavigation.route)
        private set

    init {
        appEntryUseCases.readAppEntry().onEach {
            shouldStartFromHomeScreen->
            if(shouldStartFromHomeScreen){
                startDestination = Route.NewsNavigation.route
            }
            else{
                startDestination = Route.AppStartNavigation.route
            }
            delay(300)
              splashCondition = false
        }.launchIn(viewModelScope)
    }

}