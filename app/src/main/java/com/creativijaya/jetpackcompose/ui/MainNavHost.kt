package com.creativijaya.jetpackcompose.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.creativijaya.jetpackcompose.ui.createpost.createPostGraph
import com.creativijaya.jetpackcompose.ui.home.HomeRoutes
import com.creativijaya.jetpackcompose.ui.home.homeGraph

@Composable
fun MainNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = HomeRoutes.Dashboard.route
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        // Home Graph
        homeGraph(navController)

        // Create Post Graph
        createPostGraph(navController)
    }
}
