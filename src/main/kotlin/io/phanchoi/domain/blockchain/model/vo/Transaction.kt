package io.phanchoi.domain.blockchain.model.vo

data class Transaction(
    val fromAddress: String,
    val toAddress: String,
    val amount: Double,
    val signature: String? = null
)
