package com.example.bottomnav190224.domain.usecases

import com.example.bottomnav190224.domain.entity.ShopItemShort
import com.example.bottomnav190224.domain.repository.ShopListRepository

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    suspend fun getShopList(): List<ShopItemShort> {
        return shopListRepository.getShopList()
    }
}