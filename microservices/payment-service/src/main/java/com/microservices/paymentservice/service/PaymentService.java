package com.microservices.paymentservice.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.paymentservice.entity.Payment;
import com.microservices.paymentservice.repo.PaymentRepo;

@Service
public class PaymentService {

	@Autowired
	PaymentRepo paymentRepo;
	
	public Payment savePaymnet(Payment paymnet) {
		paymnet.setStatus(isPaymentProcessed());
		paymnet.setTranasctionId(UUID.randomUUID().toString());
		return paymentRepo.save(paymnet);
		
	}
	
	public String isPaymentProcessed() {
		
//this api call will be received from third party gateway		
		return new Random().nextBoolean() ? "sucess" : "unsucess";
	}
	
}
