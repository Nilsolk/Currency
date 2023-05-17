package com.example.currency.repository

interface FromEntityToModel<T> {
    fun toModel(): T
}