package com.creativijaya.jetpackcompose.ui.home.favorite

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FavoritePage() {
    Scaffold() { innerPadding ->
        Surface(modifier = Modifier.padding(innerPadding)) {
            Text(text = "Favorites")
        }
    }
}
