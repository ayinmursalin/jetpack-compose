package com.creativijaya.jetpackcompose.ui.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.creativijaya.jetpackcompose.ui.createpost.CreatePostRoutes

/** Home Graph **/
fun NavGraphBuilder.homeGraph(navController: NavController) {
    composable(HomeRoutes.Dashboard.route) {
        HomePage(onOpenCreatePost = {
            navController.navigate(CreatePostRoutes.Content.route)
        })
    }
}
