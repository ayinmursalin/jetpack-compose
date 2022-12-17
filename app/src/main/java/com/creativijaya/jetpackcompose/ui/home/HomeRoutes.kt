package com.creativijaya.jetpackcompose.ui.home

import androidx.annotation.DrawableRes
import com.creativijaya.jetpackcompose.R

sealed class HomeRoutes(
    val route: String,
    @DrawableRes val icon: Int
) {
    object Dashboard : HomeRoutes(
        "dashboard",
        R.drawable.ic_home
    )

    object Favorite : HomeRoutes(
        "favorite",
        R.drawable.ic_favorite
    )

    object Profile : HomeRoutes(
        "profile",
        R.drawable.ic_account
    )
}
