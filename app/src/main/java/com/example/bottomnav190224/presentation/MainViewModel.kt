package com.example.bottomnav190224.presentation

import android.app.Application
import android.view.View
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.bottomnav190224.data.ShopListRepositoryImpl
import com.example.bottomnav190224.domain.entity.ShopItemShort
import com.example.bottomnav190224.domain.usecases.EditShopItemUseCase
import com.example.bottomnav190224.domain.usecases.GetShopItemUseCase
import com.example.bottomnav190224.domain.usecases.GetShopListUseCase
import kotlinx.coroutines.launch

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = ShopListRepositoryImpl
    val shopList = MutableLiveData<List<ShopItemShort>>()

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val getShopItemUseCase = GetShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)


    suspend fun getShopList() {
        val list = getShopListUseCase.getShopList()
        shopList.value = list
    }

    val test = MutableLiveData<List<String>?>()
    val test2 = MutableLiveData<String>()
    val test3 = MutableLiveData<String>()

    fun loaddata() {
        viewModelScope.launch {
            try {
                val list = getShopListUseCase.getShopList()
                test2.value = list[0].id.toString()
              //  test3.value = list[0].description.toString()
            } catch (e: Exception) {

            }
            getShopList()
        }
    }

    suspend fun changeEnableState(shopItemShort: ShopItemShort) {
        val newItem = shopItemShort.copy(enable = !shopItemShort.enable)
        getShopList()
    }

}