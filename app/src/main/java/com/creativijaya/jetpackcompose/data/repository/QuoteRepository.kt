package com.creativijaya.jetpackcompose.data.repository

import com.creativijaya.jetpackcompose.data.local.db.entities.QuoteEntity
import com.creativijaya.jetpackcompose.data.local.db.entities.QuoteTagEntity
import com.creativijaya.jetpackcompose.data.local.db.entities.TagEntity
import com.creativijaya.jetpackcompose.data.local.db.views.DetailQuoteView
import kotlinx.coroutines.flow.Flow

interface QuoteRepository {

    suspend fun insertQuote(entity: QuoteEntity): Long

    suspend fun attachQuoteTags(entities: List<QuoteTagEntity>)

    suspend fun insertTags(entities: List<TagEntity>): List<Long>

    fun getQuotes(): Flow<List<DetailQuoteView>>

    fun getAvailableTags(): Flow<List<TagEntity>>

}
