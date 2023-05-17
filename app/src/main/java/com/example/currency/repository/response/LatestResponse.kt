package com.example.currency.repository.response

import com.example.currency.repository.FromEntityToModel
import com.example.currency.repository.models.LatestModel
import com.google.gson.annotations.SerializedName

data class LatestResponse(
    @SerializedName("success")
    private val success: Boolean,
    @SerializedName("base")
    private val base: String,
    @SerializedName("date")
    private val date: String,
    @SerializedName("rates")
    private val rates: Rates,
) : FromEntityToModel<LatestModel> {
    override fun toModel(): LatestModel {
        return LatestModel(
            base = base,
            date = date,
            rates = rates
        )
    }
}

