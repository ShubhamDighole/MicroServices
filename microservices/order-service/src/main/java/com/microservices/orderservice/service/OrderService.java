package com.microservices.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.orderservice.entity.Order;
import com.microservices.orderservice.repo.OrderRepo;

@Service
public class OrderService {

	@Autowired
	private OrderRepo orderRepo;

	public Order saverOrder(Order order) {
		return orderRepo.save(order);
	}
	
}


