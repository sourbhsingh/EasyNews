package com.sourabh_projects.easynews.screen.onboarding.components

import android.content.res.Configuration
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sourabh_projects.easynews.R
import com.sourabh_projects.easynews.screen.onboarding.Page

import com.sourabh_projects.easynews.screen.dimens.MediumPadding1
import com.sourabh_projects.easynews.screen.dimens.MediumPadding2
import com.sourabh_projects.easynews.screen.onboarding.pages
import com.sourabh_projects.easynews.ui.theme.EasyNewsTheme


@Composable
fun OnBoardingPage(
    modifier : Modifier = Modifier,
    page : Page
) {
        Column ( modifier = modifier){
            Image(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.4F)
                .align(Alignment.CenterHorizontally),
                painter = painterResource(id = page.image),
                contentDescription = null,

                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(MediumPadding1))
            Text(text = page.title, modifier = Modifier.padding(horizontal = MediumPadding2),
                fontSize = 24.sp, // reduce the font size
                style =  MaterialTheme.typography.displaySmall.copy(fontWeight =  FontWeight.Bold),
                color = colorResource(id = R.color.display_small),
                )

                Text(text = page.description, modifier = Modifier.padding(horizontal = MediumPadding2)
                    , style =  MaterialTheme.typography.displayMedium.copy(),
                    fontSize = 28.sp, // reduce the font size
                    color = colorResource(id = R.color.text_medium)
                )





        }
}

