package com.creativijaya.jetpackcompose.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.creativijaya.jetpackcompose.MyAppConstant
import com.creativijaya.jetpackcompose.data.local.db.daos.QuoteDao
import com.creativijaya.jetpackcompose.data.local.db.entities.QuoteEntity
import com.creativijaya.jetpackcompose.data.local.db.entities.QuoteTagEntity
import com.creativijaya.jetpackcompose.data.local.db.entities.TagEntity

@Database(
    version = MyAppConstant.DB_VERSION,
    entities = [
        QuoteEntity::class,
        TagEntity::class,
        QuoteTagEntity::class
    ]
)
@TypeConverters(MyDatabaseConverters::class)
abstract class MyDatabase : RoomDatabase() {
    abstract fun getQuoteDao(): QuoteDao
}
