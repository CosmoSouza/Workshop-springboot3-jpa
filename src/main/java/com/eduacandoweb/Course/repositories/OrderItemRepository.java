package com.eduacandoweb.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduacandoweb.Course.entities.OrderItem;
import com.eduacandoweb.Course.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
