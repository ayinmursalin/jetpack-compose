package com.creativijaya.jetpackcompose.data.local.db

import androidx.room.TypeConverter
import java.util.*

class MyDatabaseConverters {

    @TypeConverter
    fun fromTimestamp(value: Long?): Date {
        return value?.let { Date(it) } ?: Date()
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long {
        return date?.time ?: 0L
    }

}
