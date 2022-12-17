package com.creativijaya.jetpackcompose.domain.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TagDto(
    val id: Long = 0,
    val label: String = ""
) : Parcelable
