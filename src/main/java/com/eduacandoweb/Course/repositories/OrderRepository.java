package com.eduacandoweb.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduacandoweb.Course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
