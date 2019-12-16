package com.example.order.repos;

import com.example.order.entities.OrderItem;
import org.springframework.data.repository.CrudRepository;

public interface OrderItemRepo extends CrudRepository<OrderItem, Integer> {

}