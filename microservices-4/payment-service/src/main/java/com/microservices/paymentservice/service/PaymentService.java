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
		paymnet.setStatus(paymentDone());
		paymnet.setTranasctionId(UUID.randomUUID().toString());
		return paymentRepo.save(paymnet);
		
	}
		
	//assuming that this is fetched from 3rd party api gateway like phonePay or googlepay	
		public String paymentDone() {
			
			String payment = "failed";
			boolean nextBoolean = new Random().nextBoolean();
			
			if (nextBoolean) {
				payment = "success";
			}
			
			return payment;
			
		}
	
}
