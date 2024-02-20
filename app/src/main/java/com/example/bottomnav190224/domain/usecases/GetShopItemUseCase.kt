package com.example.bottomnav190224.domain.usecases

import com.example.bottomnav190224.domain.entity.ShopItemShort
import com.example.bottomnav190224.domain.repository.ShopListRepository

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    suspend fun getShopItem(shopItemId: String): ShopItemShort {
        return shopListRepository.getShopItem(shopItemId)
    }
}