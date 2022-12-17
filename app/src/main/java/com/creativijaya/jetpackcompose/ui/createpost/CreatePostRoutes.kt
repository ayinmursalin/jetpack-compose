package com.creativijaya.jetpackcompose.ui.createpost

sealed class CreatePostRoutes(val route: String) {
    object Initial : CreatePostRoutes("create-post")
    object Content : CreatePostRoutes("create-post/content")
}
