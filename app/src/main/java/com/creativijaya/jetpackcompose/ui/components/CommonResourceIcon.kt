package com.creativijaya.jetpackcompose.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

@Composable
fun CommonResourceIcon(
    @DrawableRes id: Int,
    contentDescription: String = "",
    tint: Color = MaterialTheme.colorScheme.primary
) {
    Icon(
        painter = painterResource(id = id),
        contentDescription = contentDescription,
        tint = tint
    )
}
