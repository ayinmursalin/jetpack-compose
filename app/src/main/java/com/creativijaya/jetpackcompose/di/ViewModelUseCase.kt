package com.creativijaya.jetpackcompose.di

import com.creativijaya.jetpackcompose.ui.home.dashboard.DashboardViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val viewModelUseCase = module {

    viewModelOf(::DashboardViewModel)

}
