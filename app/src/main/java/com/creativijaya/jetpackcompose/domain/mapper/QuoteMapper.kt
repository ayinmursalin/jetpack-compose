package com.creativijaya.jetpackcompose.domain.mapper

import com.creativijaya.jetpackcompose.data.local.db.entities.QuoteEntity
import com.creativijaya.jetpackcompose.data.local.db.entities.TagEntity
import com.creativijaya.jetpackcompose.data.local.db.views.DetailQuoteView
import com.creativijaya.jetpackcompose.domain.models.QuoteDto
import com.creativijaya.jetpackcompose.domain.models.TagDto

/**
 * ------------------------------ Entity to Dto ------------------------------
 */
@JvmName("tagEntityAsDtoList")
fun List<TagEntity>.toDtoList() = this.map(TagEntity::toDto)

fun TagEntity.toDto() = TagDto(
    id = this.id,
    label = this.label
)

@JvmName("detailQuoteViewAsDtoList")
fun List<DetailQuoteView>.toDtoList() = this.map(DetailQuoteView::toDto)

fun DetailQuoteView.toDto() = QuoteDto(
    id = this.quoteEntity.id,
    author = this.quoteEntity.author,
    content = this.quoteEntity.content,
    createdAt = this.quoteEntity.createdAt,
    updatedAt = this.quoteEntity.updatedAt,
    tags = this.tags.toDtoList()
)

/**
 * ------------------------------ Dto to Entity ------------------------------
 */
fun QuoteDto.toEntity() = QuoteEntity(
    id = this.id,
    author = this.author,
    content = this.content,
    createdAt = this.createdAt,
    updatedAt = this.updatedAt
)

fun List<TagDto>.toEntityList() = this.map(TagDto::toEntity)

fun TagDto.toEntity() = TagEntity(
    id = this.id,
    label = this.label
)
