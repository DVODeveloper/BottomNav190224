package com.example.bottomnav190224.presentation.ui.sales

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SalesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Акции. По ТЗ - не активна"
    }
    val text: LiveData<String> = _text
}