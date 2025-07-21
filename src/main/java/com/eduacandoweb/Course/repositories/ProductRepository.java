package com.eduacandoweb.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduacandoweb.Course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
