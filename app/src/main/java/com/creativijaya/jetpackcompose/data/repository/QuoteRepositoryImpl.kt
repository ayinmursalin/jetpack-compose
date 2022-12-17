package com.creativijaya.jetpackcompose.data.repository

import com.creativijaya.jetpackcompose.data.local.db.daos.QuoteDao
import com.creativijaya.jetpackcompose.data.local.db.entities.QuoteEntity
import com.creativijaya.jetpackcompose.data.local.db.entities.QuoteTagEntity
import com.creativijaya.jetpackcompose.data.local.db.entities.TagEntity
import com.creativijaya.jetpackcompose.data.local.db.views.DetailQuoteView
import kotlinx.coroutines.flow.Flow

class QuoteRepositoryImpl(
    private val dao: QuoteDao
) : QuoteRepository {

    override suspend fun insertQuote(entity: QuoteEntity): Long {
        return dao.insertQuote(entity)
    }

    override suspend fun attachQuoteTags(entities: List<QuoteTagEntity>) {
        dao.attachQuoteTags(entities)
    }

    override suspend fun insertTags(entities: List<TagEntity>): List<Long> {
        return dao.insertTags(entities)
    }

    override fun getQuotes(): Flow<List<DetailQuoteView>> {
        return dao.getQuotes()
    }

    override fun getAvailableTags(): Flow<List<TagEntity>> {
        return dao.getAvailableTags()
    }

}
