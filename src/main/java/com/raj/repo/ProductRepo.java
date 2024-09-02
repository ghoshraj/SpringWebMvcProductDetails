package com.raj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raj.entity.ProductEntity;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer>{

}
