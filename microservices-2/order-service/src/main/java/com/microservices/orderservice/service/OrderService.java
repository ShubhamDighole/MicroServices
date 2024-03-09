package com.microservices.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservices.common.Payment;
import com.microservices.common.TransactionRequest;
import com.microservices.common.TransactionResponse;
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
//Adding Rest API call		
//When we will do serviceRegistery URL will not need to be hardcodeed		
		Payment paymentResponse = restTemplate.postForObject("http://localhost:9191/Payment/SavePayment",
									payment, Payment.class);
		if(paymentResponse.getStatus().equalsIgnoreCase("Success"))
			respone="The order placed sucessfully..";
		orderRepo.save(order);
		return new TransactionResponse(order,paymentResponse.getAmount(),paymentResponse.getTranasctionId(),
				respone);
	}
	
}


