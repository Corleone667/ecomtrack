package com.ecommerce.ecomtrack.productservice.repository;

import com.ecommerce.ecomtrack.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}