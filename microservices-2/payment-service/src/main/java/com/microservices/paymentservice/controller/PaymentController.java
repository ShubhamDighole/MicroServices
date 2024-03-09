package com.microservices.paymentservice.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.paymentservice.entity.Payment;
import com.microservices.paymentservice.service.PaymentService;

@RestController
@RequestMapping("/Payment")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	
	@PostMapping("/SavePayment")
	public Payment savePayment(@RequestBody Payment payment) {
		return paymentService.savePaymnet(payment);
	}
	
}
