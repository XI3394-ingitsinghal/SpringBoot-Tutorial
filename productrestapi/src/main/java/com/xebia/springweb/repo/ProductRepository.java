package com.xebia.springweb.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.xebia.springweb.entities.Products;
@Component
public interface ProductRepository extends JpaRepository<Products, Integer> {

}
