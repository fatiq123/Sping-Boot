package com.example.springpractice.controller

import com.example.springpractice.model.Product
import com.example.springpractice.service.ProductServiceImpl
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/products")
class ProductController(private val productService: ProductServiceImpl) {

    @PostMapping
    fun createProduct(@RequestBody product: Product): Product {
        return productService.save(product)
    }

    @GetMapping("/{id}")
    fun getProductById(@PathVariable id: Long): Product? {
        return productService.findById(id)
    }

    @GetMapping
    fun getAllProducts(): List<Product> {
        return productService.findAll()
    }




    @DeleteMapping("/{id}")
    fun deleteProductById(@PathVariable id: Long): Boolean {
        return productService.deleteById(id=id)
    }

    @PutMapping("/{id}")
    fun updateProductById(@PathVariable id: Long, @RequestBody updatedProduct: Product): Product? {
        return productService.updateProductById(id = id, updatedProduct = updatedProduct)
    }


    @DeleteMapping
    fun deleteAllProducts(): Boolean {
        return productService.deleteAll()
    }

}
