package com.example.bottomnav190224.domain.entity


data class ItemsResponse(
    val items: List<ShopItemShort>
)

data class Price(
    val price: String? = null,
    val discount: Int? = null,
    val priceWithDiscount: String? = null,
    val unitSymbol: String? = null
)

data class Feedback(
    val count: Int? = null,
    val rating: Double? = null
)


data class Info(
    val title: String?=null,
    val value: String? = null
)

data class ShopItemShort(
    val enable: Boolean = true,
    val id: String?=null,
    val title: String?=null,
    val subtitle: String?=null,
    val price: Price?=null,
    val feedback: Feedback?=null,
    val tags: List<String>?=null,
    val available: Int?=null,
    val description: String?=null,
    val info: List<Info>?=null,
    val ingredients: String?=null
)

