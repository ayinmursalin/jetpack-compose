package com.creativijaya.jetpackcompose.data.local.db.views

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.creativijaya.jetpackcompose.data.local.db.entities.QuoteEntity
import com.creativijaya.jetpackcompose.data.local.db.entities.QuoteTagEntity
import com.creativijaya.jetpackcompose.data.local.db.entities.TagEntity

data class DetailQuoteView(
    @Embedded
    val quoteEntity: QuoteEntity,
    @Relation(
        parentColumn = "quote_id",
        entityColumn = "tag_id",
        associateBy = Junction(QuoteTagEntity::class)
    )
    val tags: List<TagEntity>
)
