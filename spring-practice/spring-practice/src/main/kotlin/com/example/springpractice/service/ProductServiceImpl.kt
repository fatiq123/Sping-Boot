package com.example.springpractice.service

import com.example.springpractice.model.Product
import com.example.springpractice.repository.ProductRepository
import org.springframework.context.annotation.Bean

class ProductServiceImpl(private val productRepository: ProductRepository): ProductRepository {
    override fun save(product: Product): Product {
        return productRepository.save(product = product)
    }

    override fun findById(id: Long): Product? {
        return productRepository.findById(id)
    }

    override fun findAll(): List<Product> {
        return productRepository.findAll()
    }

    @Bean
    fun productServiceImpl(): ProductServiceImpl {
        return ProductServiceImpl(productRepository)
    }
}

