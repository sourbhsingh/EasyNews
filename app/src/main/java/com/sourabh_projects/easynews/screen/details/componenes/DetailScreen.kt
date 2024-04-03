package com.sourabh_projects.easynews.screen.details.componenes

import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DetailScreen(
    modifier: Modifier = Modifier,
) {
    Box(modifier) {
        Text(text = "DetailScreen")
    }
}

@Preview(name = "DetailScreen")
@Composable
private fun PreviewDetailScreen() {
    DetailScreen()
}