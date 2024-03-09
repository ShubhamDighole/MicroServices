
package com.microservices.orderservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.orderservice.entity.Order;

public interface OrderRepo extends JpaRepository<Order, Integer> {

}
