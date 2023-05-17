package com.example.currency.repository

import com.example.currency.repository.models.ConvertModel
import com.example.currency.repository.models.HistoricalModel
import com.example.currency.repository.models.LatestModel
import com.example.currency.repository.models.ModelSource
import com.google.gson.Gson
import retrofit2.Retrofit

class DataSource(retrofit: Retrofit, private val gson: Gson) : ModelSource {

    private val getApi = retrofit.create(GetApi::class.java)

    override suspend fun latestRates(base: String, symbols: List<String>): LatestModel {
        return getApi.latestRates(base, symbols).toModel()
    }

    override suspend fun convertCurrency(
        from: String,
        to: String,
        symbols: List<String>
    ): ConvertModel {
        return getApi.convertCurrency(from, to, symbols).toModel()
    }

    override suspend fun historicalRates(
        date: String,
        base: String,
        symbols: List<String>
    ): HistoricalModel {
        return getApi.historicalRates(date, base, symbols).toModel()
    }


}