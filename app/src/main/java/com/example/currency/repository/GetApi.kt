package com.example.currency.repository

import com.example.currency.repository.response.ConvertResponse
import com.example.currency.repository.response.HistoricalResponse
import com.example.currency.repository.response.LatestResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GetApi {
    @GET("latest")
    suspend fun latestRates(
        @Query("base") base: String,
        @Query("symbols") symbols: List<String>
    ): LatestResponse

    @GET("convert")
    suspend fun convertCurrency(
        @Query("from") from: String,
        @Query("to") to: String,
        @Query("symbols") symbols: List<String>
    ): ConvertResponse

    @GET("{date}")
    suspend fun historicalRates(
        @Path("date") date: String,
        @Query("base") base: String,
        @Query("symbols") symbols: List<String>
    ): HistoricalResponse
}