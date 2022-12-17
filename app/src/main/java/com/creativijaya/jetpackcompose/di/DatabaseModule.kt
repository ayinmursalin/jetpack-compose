package com.creativijaya.jetpackcompose.di

import androidx.room.Room
import com.creativijaya.jetpackcompose.MyAppConstant
import com.creativijaya.jetpackcompose.data.local.db.MyDatabase
import org.koin.dsl.module

val databaseModule = module {

    single {
        Room.databaseBuilder(
            get(),
            MyDatabase::class.java,
            MyAppConstant.DB_NAME
        ).build()
    }

    single {
        get<MyDatabase>().getQuoteDao()
    }

}
