package com.example.currency.repository.models

import com.example.currency.repository.response.Rates

data class HistoricalModel(
    private val base: String,
    private val date: String,
    private val rates: Rates,
)