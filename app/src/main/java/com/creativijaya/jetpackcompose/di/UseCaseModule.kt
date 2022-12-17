package com.creativijaya.jetpackcompose.di

import com.creativijaya.jetpackcompose.domain.usecases.GetAvailableTagsUseCase
import com.creativijaya.jetpackcompose.domain.usecases.GetQuotesUseCase
import com.creativijaya.jetpackcompose.domain.usecases.InsertQuoteUseCase
import com.creativijaya.jetpackcompose.domain.usecases.InsertTagsUseCase
import org.koin.dsl.module

val useCaseModule = module {

    factory {
        GetAvailableTagsUseCase(get())
    }

    factory {
        InsertTagsUseCase(get())
    }

    factory {
        InsertQuoteUseCase(get())
    }

    factory {
        GetQuotesUseCase(get())
    }

}
