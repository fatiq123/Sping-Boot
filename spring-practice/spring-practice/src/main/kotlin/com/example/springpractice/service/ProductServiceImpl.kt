package com.example.springpractice.service

import com.example.springpractice.model.Product
import com.example.springpractice.repository.ProductRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.ResponseBody

@Service
class ProductServiceImpl : ProductRepository {

    private val products = mutableListOf<Product>()

    override fun save(product: Product): Product {
        product.id = (products.size + 1).toLong()
        products.add(product)
        return product
    }

    override fun findById(id: Long): Product? {
        return products.find { it.id == id }
    }

    override fun findAll(): List<Product> {
        return products.toList()
    }




    override fun deleteAll(): Boolean {
        products.clear()
        return true
    }

    override fun deleteById(id: Long): Boolean {
        val product = products.find { it.id == id }
        return if (product != null) {
            products.remove(product)
//            ResponseEntity.ok(product)
            true
        } else {
//            ResponseEntity.notFound().build<Product>()
            false
        }
    }

    override fun updateProductById(id: Long, updatedProduct: Product): Product? {
        val existingProduct = products.find { it.id == id }
        return existingProduct?.apply {
            name = updatedProduct.name
            description = updatedProduct.description
            price = updatedProduct.price
        }
    }
}

