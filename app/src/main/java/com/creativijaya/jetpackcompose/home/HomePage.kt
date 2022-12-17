package com.creativijaya.jetpackcompose.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.creativijaya.jetpackcompose.R
import com.creativijaya.jetpackcompose.home.dashboard.DashboardPage
import com.creativijaya.jetpackcompose.home.favorite.FavoritePage
import com.creativijaya.jetpackcompose.ui.components.CommonResourceIcon

val homePages = listOf(
    HomeRoutes.Dashboard,
    HomeRoutes.Favorite
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage(
    onOpenCreatePost: () -> Unit = {},
) {
    val homeNavController = rememberNavController()

    Scaffold(
        bottomBar = {
            val navState by homeNavController.currentBackStackEntryAsState()
            val currentScreen = navState?.destination

            BottomAppBar(
                floatingActionButton = {
                    SmallFloatingActionButton(
                        onClick = onOpenCreatePost
                    ) {
                        CommonResourceIcon(R.drawable.ic_add)
                    }
                },
                actions = {
                    homePages.forEach { page ->
                        Spacer(modifier = Modifier.width(12.dp))
                        IconButton(
                            onClick = {
                                homeNavController.navigate(page.route)
                            },
                            modifier = if (currentScreen?.route == page.route) {
                                Modifier
                                    .clip(MaterialTheme.shapes.large)
                                    .background(MaterialTheme.colorScheme.onPrimary)
                            } else {
                                Modifier
                            }
                        ) {
                            CommonResourceIcon(page.icon)
                        }
                    }
                },
            )
        },
    ) { innerPadding ->
        NavHost(
            navController = homeNavController,
            startDestination = HomeRoutes.Dashboard.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(HomeRoutes.Dashboard.route) {
                DashboardPage()
            }

            composable(HomeRoutes.Favorite.route) {
                FavoritePage()
            }
        }
    }
}
