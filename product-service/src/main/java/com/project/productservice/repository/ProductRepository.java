package com.project.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.productservice.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>{

}
