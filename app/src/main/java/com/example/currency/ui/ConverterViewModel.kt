package com.example.currency.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class ConverterViewModel : ViewModel() {
    private val liveData = MutableLiveData<String>()

    fun save() {
        liveData.value
    }
}