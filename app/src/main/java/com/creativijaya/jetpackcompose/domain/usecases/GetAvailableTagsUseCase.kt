package com.creativijaya.jetpackcompose.domain.usecases

import com.creativijaya.jetpackcompose.data.local.db.entities.TagEntity
import com.creativijaya.jetpackcompose.data.repository.QuoteRepository
import com.creativijaya.jetpackcompose.domain.mapper.toDtoList
import com.creativijaya.jetpackcompose.domain.models.TagDto
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetAvailableTagsUseCase(
    private val repository: QuoteRepository
) {
    operator fun invoke(): Flow<List<TagDto>> {
        return repository
            .getAvailableTags()
            .map(List<TagEntity>::toDtoList)
    }
}
