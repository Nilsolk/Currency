package com.example.currency.repository.response

import com.example.currency.repository.FromEntityToModel
import com.example.currency.repository.models.HistoricalModel
import com.google.gson.annotations.SerializedName

data class HistoricalResponse(
    @SerializedName("success")
    private val success: Boolean,

    @SerializedName("base")
    private val base: String,

    @SerializedName("date")
    private val date: String,

    @SerializedName("rates")
    private val rates: Rates,
) : FromEntityToModel<HistoricalModel> {
    override fun toModel(): HistoricalModel {
        return HistoricalModel(base, date, rates)
    }
}
