package com.creativijaya.jetpackcompose.domain.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.Date

@Parcelize
data class QuoteDto(
    val id: Long = 0L,
    val author: String = "",
    val content: String = "",
    val createdAt: Date = Date(),
    val updatedAt: Date = Date(),
    val tags: List<TagDto> = emptyList()
) : Parcelable
