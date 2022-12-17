package com.creativijaya.jetpackcompose.domain.usecases

import android.util.Log
import com.creativijaya.jetpackcompose.data.local.db.entities.QuoteTagEntity
import com.creativijaya.jetpackcompose.data.repository.QuoteRepository
import com.creativijaya.jetpackcompose.domain.mapper.toEntity
import com.creativijaya.jetpackcompose.domain.mapper.toEntityList
import com.creativijaya.jetpackcompose.domain.models.QuoteDto

class InsertQuoteUseCase(
    private val repository: QuoteRepository
) {
    suspend operator fun invoke(quoteDto: QuoteDto) {
        Log.d("DEBUG_MAIN", "insert $quoteDto")

        val quoteId = repository.insertQuote(quoteDto.toEntity())
        val tagIds = repository.insertTags(quoteDto.tags.toEntityList())

        Log.d("DEBUG_MAIN", "quoteId $quoteId | ${tagIds}")

        repository.attachQuoteTags(createQuoteTags(quoteId, tagIds))
    }

    private fun createQuoteTags(quoteId: Long, tagIds: List<Long>) = tagIds.map { tagId ->
        QuoteTagEntity(
            quoteId = quoteId,
            tagId = tagId
        )
    }
}
