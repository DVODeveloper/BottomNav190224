package com.example.bottomnav190224.data.api

import com.example.bottomnav190224.domain.entity.ItemsResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("v3/97e721a7-0a66-4cae-b445-83cc0bcf9010")
    suspend fun getShopListFromAPI(): Response<ItemsResponse>
}