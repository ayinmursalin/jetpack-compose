package com.creativijaya.jetpackcompose.ui.home.dashboard

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.creativijaya.jetpackcompose.domain.models.QuoteDto
import com.creativijaya.jetpackcompose.domain.usecases.GetQuotesUseCase
import com.creativijaya.jetpackcompose.domain.usecases.InsertQuoteUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class DashboardViewModel(
    savedStateHandle: SavedStateHandle,
    private val getQuotesUseCase: GetQuotesUseCase,
    private val insertQuoteUseCase: InsertQuoteUseCase
) : ViewModel() {

    private val _uiState: MutableStateFlow<DashboardState> = MutableStateFlow(DashboardState())

    val uiState: StateFlow<DashboardState>
        get() = _uiState.asStateFlow()

    init {
        getQuotes()
    }

    private fun getQuotes() = viewModelScope.launch {
        getQuotesUseCase().collect { quotes ->
            _uiState.update {
                it.copy(
                    quotes = quotes
                )
            }
        }
    }

    fun addQuote() = viewModelScope.launch {
        val dto = QuoteDto(
            content = "Test : ${System.currentTimeMillis()}"
        )

        insertQuoteUseCase(dto)
    }

}
