package com.sourabh_projects.easynews.screen.navgraph

import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.sourabh_projects.easynews.screen.onboarding.OnBoardingScreen
import com.sourabh_projects.easynews.screen.onboarding.OnBoardingViewModal
import dagger.hilt.android.lifecycle.HiltViewModel
import androidx.activity.viewModels
import androidx.compose.material3.Text
import androidx.hilt.navigation.HiltViewModelFactory
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun NavGraph(
    startDestination: String
) {
    val navController = rememberNavController()
    NavHost(navController =  navController, startDestination = startDestination){
        navigation(
            route = Route.AppStartNavigation.route,
            startDestination = Route.OnBoardingScreen.route
        ){
            composable(
                route = Route.OnBoardingScreen.route
            ){
                val viewModel : OnBoardingViewModal=  hiltViewModel()
                OnBoardingScreen(event = viewModel::onEvent)
            }
        }
        navigation(
            route = Route.NewsNavigation.route,
            startDestination= Route.NewsNavigatorScreen.route
        ){
            composable(route= Route.NewsNavigatorScreen.route){
                Text(text = "News Navigator Screen")
            }
        }
    }

}