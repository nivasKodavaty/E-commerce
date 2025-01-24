package com.example.E_Comm.Service

import com.example.E_Comm.Model.Product
import com.example.E_Comm.Repositories.ProductRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ProductService(private val productRepository: ProductRepository) {

    @Transactional
    fun saveProduct(product: Product): Product {
        return productRepository.save(product);
    }

    fun getAllProducts():List<Product>{
        return productRepository.findAll()
    }
}
