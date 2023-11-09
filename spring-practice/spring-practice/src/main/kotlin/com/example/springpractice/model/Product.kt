package com.example.springpractice.model

import java.math.BigDecimal

data class Product(
    val id: Long,
    val name: String,
    val description: String,
    val price: BigDecimal
)
