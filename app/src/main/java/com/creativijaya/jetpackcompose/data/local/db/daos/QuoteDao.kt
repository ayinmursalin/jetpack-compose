package com.creativijaya.jetpackcompose.data.local.db.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.creativijaya.jetpackcompose.data.local.db.entities.QuoteEntity
import com.creativijaya.jetpackcompose.data.local.db.entities.QuoteTagEntity
import com.creativijaya.jetpackcompose.data.local.db.entities.TagEntity
import com.creativijaya.jetpackcompose.data.local.db.views.DetailQuoteView
import kotlinx.coroutines.flow.Flow

@Dao
interface QuoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertQuote(entity: QuoteEntity): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun attachQuoteTags(entities: List<QuoteTagEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTags(entities: List<TagEntity>): List<Long>

    @Query("SELECT * FROM quotes")
    fun getQuotes(): Flow<List<DetailQuoteView>>

    @Query("SELECT * FROM tags")
    fun getAvailableTags(): Flow<List<TagEntity>>

}
