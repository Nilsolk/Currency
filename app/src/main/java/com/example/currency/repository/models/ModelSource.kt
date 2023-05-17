package com.example.currency.repository.models

interface ModelSource {
    suspend fun latestRates(
        base: String,
        symbols: List<String>
    ): LatestModel

    suspend fun convertCurrency(
        from: String,
        to: String,
        symbols: List<String>
    ): ConvertModel

    suspend fun historicalRates(
        date: String,
        base: String,
        symbols: List<String>
    ): HistoricalModel

}