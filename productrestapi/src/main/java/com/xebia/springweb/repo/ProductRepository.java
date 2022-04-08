package com.xebia.springweb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xebia.springweb.entities.Products;

public interface ProductRepository extends JpaRepository<Products, Integer> {

}
