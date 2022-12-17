package com.creativijaya.jetpackcompose.domain.usecases

import com.creativijaya.jetpackcompose.data.local.db.views.DetailQuoteView
import com.creativijaya.jetpackcompose.data.repository.QuoteRepository
import com.creativijaya.jetpackcompose.domain.mapper.toDtoList
import com.creativijaya.jetpackcompose.domain.models.QuoteDto
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetQuotesUseCase(
    private val repository: QuoteRepository
) {
    operator fun invoke(): Flow<List<QuoteDto>> {
        return repository
            .getQuotes()
            .map(List<DetailQuoteView>::toDtoList)
    }
}
