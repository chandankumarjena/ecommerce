package com.chandan.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandan.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
