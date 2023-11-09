package com.example.springpractice.model

import java.math.BigDecimal

data class Product(
    var id: Long,
    var name: String,
    var description: String,
    var price: BigDecimal
)
