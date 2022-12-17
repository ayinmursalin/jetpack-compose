package com.creativijaya.jetpackcompose.ui.home.dashboard

import com.creativijaya.jetpackcompose.domain.models.QuoteDto

data class DashboardState(
    val quotes: List<QuoteDto> = emptyList()
)
