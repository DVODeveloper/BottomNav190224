package com.example.bottomnav190224.presentation.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Главная страница. По ТЗ - не активна"
    }
    val text: LiveData<String> = _text
}