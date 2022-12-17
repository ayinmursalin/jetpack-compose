package com.creativijaya.jetpackcompose.data.local.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    tableName = "quote_tag",
    primaryKeys = ["quote_id", "tag_id"]
)
data class QuoteTagEntity(
    @ColumnInfo(name = "quote_id")
    var quoteId: Long = 0L,
    @ColumnInfo(name = "tag_id")
    var tagId: Long = 0L
)
