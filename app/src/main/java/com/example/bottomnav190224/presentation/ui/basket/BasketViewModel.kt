package com.example.bottomnav190224.presentation.ui.basket

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BasketViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Корзина. По ТЗ - не активна"
    }
    val text: LiveData<String> = _text
}