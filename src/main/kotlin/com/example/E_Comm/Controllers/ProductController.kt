package com.example.E_Comm.Controllers

import com.example.E_Comm.Model.Product
import com.example.E_Comm.Service.ProductService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/product")
class ProductController(private val productService: ProductService) {

    @PostMapping("/create")
    fun createProduct(@RequestBody product: Product): ResponseEntity<Product> {
        val savedProduct = productService.saveProduct(product)
        return ResponseEntity.ok(savedProduct)
    }

    @GetMapping
    fun getAllProducts(): ResponseEntity<List<Product>> {
        val products = productService.getAllProducts()
        return ResponseEntity.ok(products)
    }
}