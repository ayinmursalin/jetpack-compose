package com.creativijaya.jetpackcompose

import android.app.Application
import com.creativijaya.jetpackcompose.di.databaseModule
import com.creativijaya.jetpackcompose.di.repositoryModule
import com.creativijaya.jetpackcompose.di.useCaseModule
import com.creativijaya.jetpackcompose.di.viewModelUseCase
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()

        setupKoin()
    }

    private fun setupKoin() {
        startKoin {
            androidContext(this@MyApp)

            modules(
                databaseModule,
                repositoryModule,
                useCaseModule,
                viewModelUseCase
            )
        }
    }

}
