package com.example.metest.domain.entity

import android.graphics.drawable.Icon
import android.media.Image
import android.widget.Button

data class ShopItemDetail (
    val id: Int,
    val buttonShare: Button, //нефункциональный элемент
    val iconFavourites: Icon, //иконка избранное
    val image: Image, // изображение товара
    val iconQuestion: Icon, //иконка вопроса, нефункциональный элемент
    val title: String, // заголовок
    val subTitle: String, // подзаголовок
    val availableProducts: String, // Доступные товары
    val productRatingScale: Icon, // Шкала рейтинга товара
    val productRating: String, // Рейтинг товара
    val numberOfReviews: String, // Число отзывов
    val newPrice: Int, // Новая цена
    val symbolOfPrice: String, // Символ единицы измерения цены
    val oldPrice: Int, // Старая цена
    val priceDiscount: String, // Процент скидки
    val titleDescription: String, // Заголовок “Описание”. Хардкод
    val buttonBrand: Button, // Кнопка перехода к бренду
    val descriptionOfProduct: String, // Описание продукта
    val buttonHideMore1: Button, // Кнопка “Скрыть”/”Подробнее”
    val titleCharacteristics: String, // Заголовок “Характеристики”. Хардкод.
    val blockWithCharacteristics: List<String>,   // Блок с характеристиками.
                                                  // Для отображения данных в этом блоке используется массив info.
                                                  //  Данные отображаются в том порядке, в котором они приходят в этом массиве
    val titleComposition: String, // Заголовок “Состав”. Хардкод.
    val productComposition: String, // Состав товара. Данные берутся из поля ingredients.
    val buttonHideMore2: Button, // Кнопка “Скрыть”/”Подробнее”
    val buttonAddItemToCart: Button, // Кнопка добавления товара в корзину. Нефункциональный элемент

)