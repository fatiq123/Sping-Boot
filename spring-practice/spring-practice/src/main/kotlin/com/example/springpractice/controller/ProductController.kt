package com.example.springpractice.controller

import com.example.springpractice.model.Product
import com.example.springpractice.service.ProductServiceImpl
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/products")
class ProductController(private val productServiceImpl: ProductServiceImpl) {

    @PostMapping
    fun createProduct(@RequestBody product: Product) : Product {
        return productServiceImpl.save(product = product)
    }

    @GetMapping("/{id}")
    fun getProductById(@PathVariable id: Long): Product? {
        return productServiceImpl.findById(id = id)
    }

    @GetMapping
    fun getAllProducts(): List<Product> {
        return productServiceImpl.findAll()
    }

}