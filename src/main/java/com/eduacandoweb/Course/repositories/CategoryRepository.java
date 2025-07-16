package com.eduacandoweb.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduacandoweb.Course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
