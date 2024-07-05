package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ui.theme.SeaWeed

@Composable
fun DashboardContent() {
    Box(
        modifier = Modifier.fillMaxSize()
            .background(SeaWeed)
    )
}