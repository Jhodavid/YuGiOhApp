package com.johcode.yugiohapp.data



data class CardEntity (
    val id: Long,
    val name: String,
    val type: String,
    val frameType: String,
    val desc: String,
    val race: String,
    val archetype: String,
    val ygoprodeckURL: String,
    val cardSets: List<CardSet>,
    val cardImages: List<CardImage>,
    val cardPrices: List<CardPrice>
)

data class CardImage (
    val id: Long,
    val imageURL: String,
    val imageURLSmall: String,
    val imageURLCropped: String
)

data class CardPrice (
    val cardmarketPrice: String,
    val tcgplayerPrice: String,
    val ebayPrice: String,
    val amazonPrice: String,
    val coolstuffincPrice: String
)

data class CardSet (
    val setName: String,
    val setCode: String,
    val setRarity: String,
    val setRarityCode: String,
    val setPrice: String
)
