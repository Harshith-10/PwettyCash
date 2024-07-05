package ui

import PwettyViewModel
import Screen
import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun DashboardUI(
    logoFontFamily: FontFamily,
    viewModel: PwettyViewModel
) {
    Row(
        modifier = Modifier.fillMaxSize()
            .background(Color.White)
    ) {
        val selectedScreen by viewModel.selectedScreen.collectAsState()

        Column(
            modifier = Modifier.fillMaxHeight()
                .fillMaxWidth(1f/4f)
                .padding(16.dp)
        ) {
            Text(
                text = "Petty Cashbook",
                modifier = Modifier.padding(4.dp),
                style = MaterialTheme.typography.h4.copy(
                    fontFamily = logoFontFamily,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            Column(
                modifier = Modifier.clip(RoundedCornerShape(16.dp))
                    .background(Color.LightGray.copy(alpha = 0.5f))
                    .padding(16.dp)
            ) {
                MenuItem(viewModel, Screen.Dashboard, Icons.Filled.Home, "Dashboard")
                Spacer(modifier = Modifier.height(8.dp))
                MenuItem(viewModel, Screen.Transactions, Icons.Filled.Done, "Transactions")
                Spacer(modifier = Modifier.height(8.dp))
                MenuItem(viewModel, Screen.MyWallet, Icons.Filled.Menu, "My Wallet")
                Spacer(modifier = Modifier.height(8.dp))
                MenuItem(viewModel, Screen.Stats, Icons.Filled.Star, "Stats")
            }

            Spacer(modifier = Modifier.weight(1f))

            Row(
                modifier = Modifier.fillMaxWidth()
                    .clip(CircleShape)
                    .clickable {
                        viewModel.selectScreen(Screen.Settings)
                    }
                    .padding(horizontal = 16.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Outlined.Settings,
                    contentDescription = "Settings",
                    tint = Color.Black
                )

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "Settings",
                    modifier = Modifier.padding(4.dp),
                    style = MaterialTheme.typography.h6.copy(
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth()
                    .clip(CircleShape)
                    .clickable {
                        /* TODO: Logout */
                    }
                    .padding(horizontal = 16.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Outlined.Delete,
                    contentDescription = "Logout",
                    tint = Color.Black
                )

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "Logout",
                    modifier = Modifier.padding(4.dp),
                    style = MaterialTheme.typography.h6.copy(
                        color = Color.Black,
                        fontWeight = FontWeight.SemiBold
                    )
                )
            }
        }

        Divider(
            color = Color.Gray,
            modifier = Modifier.fillMaxHeight()
                .width(1.dp)
        )

        AnimatedContent(
            targetState = selectedScreen,
            modifier = Modifier.fillMaxSize(),
            transitionSpec = {
                fadeIn(
                    tween(300)
                ).togetherWith(
                    fadeOut(tween(300))
                )
            }
        ) {
            when (selectedScreen) {
                is Screen.Dashboard -> DashboardContent()
                is Screen.Transactions -> TransactionsContent()
                is Screen.MyWallet -> MyWalletContent()
                is Screen.Stats -> StatsContent()
                is Screen.Settings -> SettingsContent()
            }
        }
    }
}

@Composable
private fun MenuItem(
    viewModel: PwettyViewModel,
    screen: Screen,
    icon: ImageVector,
    text: String
) {
    val selectedScreen by viewModel.selectedScreen.collectAsState()

    val isSelected = selectedScreen == screen

    val backgroundColor by animateColorAsState(targetValue = if (isSelected) Color.Black else Color.White)
    val contentColor by animateColorAsState(targetValue = if (isSelected) Color.White else Color.Black)

    Row(
        modifier = Modifier.fillMaxWidth()
            .clip(CircleShape)
            .background(color = backgroundColor)
            .clickable {
                viewModel.selectScreen(screen)
            }
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = text,
            tint = contentColor
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text, color = contentColor)
    }
}