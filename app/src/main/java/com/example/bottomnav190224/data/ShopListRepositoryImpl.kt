package com.example.bottomnav190224.data


import androidx.lifecycle.MutableLiveData
import com.example.bottomnav190224.data.api.ApiFactory
import com.example.bottomnav190224.domain.repository.ShopListRepository
import com.example.bottomnav190224.domain.entity.ShopItemShort

object ShopListRepositoryImpl: ShopListRepository {

    private val shopList = mutableListOf<ShopItemShort>()
    private val shopListLD = MutableLiveData<List<ShopItemShort>>()




    override fun addShopItem(shopItemShort: ShopItemShort) {
//            shopItemShort.id = autoIncrementId++
//            shopList.add(shopItemShort)

    }

    override fun deleteShopItemUseCase(shopItemShort: ShopItemShort) {
        shopList.remove(shopItemShort)
    }

    override suspend fun getShopItem(shopItemId: String): ShopItemShort {
        val response = ApiFactory.apiService.getShopListFromAPI()
        if (response.isSuccessful) {
            return response.body()?.items?.find {
                it.id == shopItemId
            }?: throw RuntimeException ("Exception: id = $shopItemId not found")
        } else {
            throw Exception("Failed to fetch shop list")
        }
    }

    override suspend fun getShopList(): List<ShopItemShort> {
       // return shopListLD
        val response = ApiFactory.apiService.getShopListFromAPI()
        if (response.isSuccessful) {
            return response.body()?.items?.map { it } ?: emptyList()
        } else {
            throw Exception("Failed to fetch shop list")
        }
    }

    override fun editShopItemUseCase(shopItemShort: ShopItemShort) {
        TODO("Not yet implemented")
    }

    private fun updateList() {
        shopListLD.value = shopList.toList()
    }
}