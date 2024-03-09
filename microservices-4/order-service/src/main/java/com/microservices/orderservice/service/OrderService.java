package com.microservices.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservices.orderservice.common.Payment;
import com.microservices.orderservice.common.TransactionRequest;
import com.microservices.orderservice.common.TransactionResponse;
import com.microservices.orderservice.entity.Order;
import com.microservices.orderservice.repo.OrderRepo;

@Service
public class OrderService {

	@Autowired
	private OrderRepo orderRepo;
	
	@Autowired
	private RestTemplate restTemplate;

	public TransactionResponse saveOrder(TransactionRequest transReq) {
		String respone="Order is failed";
		Order order = transReq.getOrder();
		Payment payment = transReq.getPayment();
		payment.setOrderId(order.getId());
		payment.setAmount(order.getPrice());
//NOW we have register on Eureka Service registery so we will no more hardcode the value and get the value from eureka service registery	
		Payment paymentResponse = restTemplate.postForObject("http://PAYMENT-SERVICE/Payment/SavePayment",
									payment, Payment.class);
		
//		Payment paymentResponse = restTemplate.postForObject("http://localhost:9191/Payment/SavePayment",
//				payment, Payment.class);
		if(paymentResponse.getStatus().equalsIgnoreCase("Success"))
			respone="The order placed sucessfully..";
		orderRepo.save(order);
		return new TransactionResponse(order,paymentResponse.getAmount(),paymentResponse.getTranasctionId(),
				respone);
	}
	
}


