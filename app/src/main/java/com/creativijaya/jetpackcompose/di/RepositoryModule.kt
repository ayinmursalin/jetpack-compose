package com.creativijaya.jetpackcompose.di

import com.creativijaya.jetpackcompose.data.repository.QuoteRepository
import com.creativijaya.jetpackcompose.data.repository.QuoteRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {

    single<QuoteRepository> {
        QuoteRepositoryImpl(get())
    }

}
