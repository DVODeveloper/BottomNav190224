package com.example.bottomnav190224.domain.usecases

import com.example.bottomnav190224.domain.entity.ShopItemShort
import com.example.bottomnav190224.domain.repository.ShopListRepository

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteShopItemUseCase(shopItemShort: ShopItemShort) {
        shopListRepository.deleteShopItemUseCase(shopItemShort)
    }
}