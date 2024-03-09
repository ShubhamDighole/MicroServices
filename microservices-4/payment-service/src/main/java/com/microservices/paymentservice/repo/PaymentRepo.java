package com.microservices.paymentservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.paymentservice.entity.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Integer>{

	
	
	
}
