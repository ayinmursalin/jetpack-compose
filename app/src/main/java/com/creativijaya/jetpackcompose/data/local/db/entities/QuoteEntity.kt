package com.creativijaya.jetpackcompose.data.local.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "quotes")
data class QuoteEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "quote_id")
    var id: Long = 0L,
    @ColumnInfo(name = "author")
    var author: String = "",
    @ColumnInfo(name = "content")
    var content: String = "",
    @ColumnInfo(name = "created_at")
    var createdAt: Date = Date(),
    @ColumnInfo(name = "updated_at")
    var updatedAt: Date = Date()
)
