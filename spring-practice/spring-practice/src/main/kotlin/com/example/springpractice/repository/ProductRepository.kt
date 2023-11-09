package com.example.springpractice.repository

import com.example.springpractice.model.Product
import net.datafaker.providers.base.Bool

interface ProductRepository {
    fun save(product: Product): Product     // to create a product using POST method
    fun findById(id: Long): Product?    // to find specific product by id
    fun findAll(): List<Product>        // to get all products

    fun deleteAll(): Boolean     // to delete all products
    fun deleteById(id: Long): Boolean      // to delete specific product


    fun updateProductById(id: Long, updatedProduct: Product): Product?       // update specific product by id

}