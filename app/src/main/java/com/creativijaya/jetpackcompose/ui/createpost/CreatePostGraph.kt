package com.creativijaya.jetpackcompose.ui.createpost

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.creativijaya.jetpackcompose.ui.createpost.content.CreatePostContentPage

/** Create Post Graph **/
fun NavGraphBuilder.createPostGraph(navController: NavController) {
    navigation(
        startDestination = CreatePostRoutes.Content.route,
        route = CreatePostRoutes.Initial.route
    ) {
        composable(CreatePostRoutes.Content.route) {
            CreatePostContentPage()
        }
    }
}
