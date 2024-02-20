package com.example.bottomnav190224.domain.usecases

import com.example.bottomnav190224.domain.entity.ShopItemShort
import com.example.bottomnav190224.domain.repository.ShopListRepository


class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopItem(shopItemShort: ShopItemShort) {
        shopListRepository.addShopItem(shopItemShort)
    }
}