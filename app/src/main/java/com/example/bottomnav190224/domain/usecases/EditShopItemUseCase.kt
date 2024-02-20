package com.example.bottomnav190224.domain.usecases

import com.example.bottomnav190224.domain.entity.ShopItemShort
import com.example.bottomnav190224.domain.repository.ShopListRepository

class EditShopItemUseCase (private val shopListRepository: ShopListRepository) {

    fun editShopItemUseCase(shopItemShort: ShopItemShort) {
        shopListRepository.editShopItemUseCase(shopItemShort)
    }
}