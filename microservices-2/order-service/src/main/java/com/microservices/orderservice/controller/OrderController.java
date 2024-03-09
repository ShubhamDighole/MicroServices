package com.microservices.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.common.Payment;
import com.microservices.common.TransactionRequest;
import com.microservices.common.TransactionResponse;
import com.microservices.orderservice.entity.Order;
import com.microservices.orderservice.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	
	@PostMapping("/saveOrder")
	public TransactionResponse save(@RequestBody TransactionRequest transReq) {
		
		return orderService.saveOrder(transReq);
	}
	
}
