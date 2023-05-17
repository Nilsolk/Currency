package com.example.currency.repository.response

import com.example.currency.repository.FromEntityToModel
import com.example.currency.repository.models.ConvertModel
import com.google.gson.annotations.SerializedName


data class ConvertResponse(
    @SerializedName("success")
    private val success: Boolean,
    @SerializedName("query")
    private val query: Query,
    @SerializedName("result")
    private val result: Double,
) : FromEntityToModel<ConvertModel> {
    override fun toModel(): ConvertModel {
        return ConvertModel(query, result)
    }
}

data class Query(
    @SerializedName("from")
    private val from: String,

    @SerializedName("to")
    private val to: String,

    @SerializedName("amount")
    private val amount: Int
)
