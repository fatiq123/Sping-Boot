package com.example.springpractice.repository

import com.example.springpractice.model.Product

interface ProductRepository {
    fun save(product: Product): Product
    fun findById(id: Long): Product?
    fun findAll(): List<Product>

}