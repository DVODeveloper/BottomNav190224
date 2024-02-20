package com.example.bottomnav190224.domain.repository

import com.example.bottomnav190224.domain.entity.ShopItemShort

interface ShopListRepository {

    fun addShopItem(shopItemShort: ShopItemShort)

    fun deleteShopItemUseCase(shopItemShort: ShopItemShort)

    suspend fun getShopItem(shopItemId: String): ShopItemShort

    suspend fun getShopList(): List<ShopItemShort>

    fun editShopItemUseCase(shopItemShort: ShopItemShort)

}