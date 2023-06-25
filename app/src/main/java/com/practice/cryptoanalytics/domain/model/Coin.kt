package com.practice.cryptoanalytics.domain.model

import com.practice.cryptoanalytics.domain.model.remote.CoinDto

data class Coin(
    val name: String,
    val shortName: String,
    val price: String,
    val updatedDate: String
)

fun CoinDto.toCoin(): Coin {
    return Coin(
        name = this.name,
        shortName = this.symbol,
        price = this.currentPrice.toString(),
        updatedDate = this.lastUpdated
    )
}

