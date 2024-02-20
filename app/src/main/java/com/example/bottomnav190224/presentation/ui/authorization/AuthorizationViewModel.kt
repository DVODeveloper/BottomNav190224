package com.example.bottomnav190224.presentation.ui.authorization

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AuthorizationViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "AuthorizationFragment"
    }
    val text: LiveData<String> = _text
}