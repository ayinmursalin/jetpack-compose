package com.creativijaya.jetpackcompose.domain.usecases

import com.creativijaya.jetpackcompose.data.repository.QuoteRepository
import com.creativijaya.jetpackcompose.domain.mapper.toEntity
import com.creativijaya.jetpackcompose.domain.models.TagDto

class InsertTagsUseCase(
    private val repository: QuoteRepository
) {
    suspend operator fun invoke(tag: List<TagDto>) {
        repository.insertTags(tag.map(TagDto::toEntity))
    }
}
