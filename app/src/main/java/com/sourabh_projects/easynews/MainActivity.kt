package com.sourabh_projects.easynews

import android.os.Bundle
import dagger.hilt.android.lifecycle.HiltViewModel
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import androidx.lifecycle.lifecycleScope
import com.sourabh_projects.easynews.domain.manager.usecases.AppEntryUseCases
import com.sourabh_projects.easynews.screen.navgraph.NavGraph
import com.sourabh_projects.easynews.screen.onboarding.OnBoardingEvent
import com.sourabh_projects.easynews.screen.onboarding.OnBoardingScreen
import com.sourabh_projects.easynews.screen.onboarding.OnBoardingViewModal
import com.sourabh_projects.easynews.ui.theme.EasyNewsTheme
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewModelComponent
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
     val viewModal by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window,false)
        installSplashScreen().apply { 
            setKeepOnScreenCondition{
                viewModal.splashCondition
            }
        }


        setContent {
            EasyNewsTheme {

                Box(
                    modifier = Modifier.background(color =MaterialTheme.colorScheme.background)
                ) {
                  val startDestination = viewModal.startDestination
                    NavGraph(startDestination = startDestination)
                }
            }
        }
    }
}
