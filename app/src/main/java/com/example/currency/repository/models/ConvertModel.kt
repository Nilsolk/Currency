package com.example.currency.repository.models

import com.example.currency.repository.response.Query

data class ConvertModel(private val query: Query, private val result: Double)