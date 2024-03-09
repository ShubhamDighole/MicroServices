package com.microservices.common;

import com.microservices.orderservice.entity.Order;

public class TransactionResponse {
	
	private	 Order order;
	private double amount;
	private String TransactionId;
	private String response;
	
	
	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public String getTransactionId() {
		return TransactionId;
	}


	public void setTransactionId(String transactionId) {
		TransactionId = transactionId;
	}


	public String getResponse() {
		return response;
	}


	public void setResponse(String response) {
		this.response = response;
	}


	public TransactionResponse(Order order, double amount, String transactionId, String response) {
		super();
		this.order = order;
		this.amount = amount;
		TransactionId = transactionId;
		this.response = response;
	}


	public TransactionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "TransactionResponse [order=" + order + ", amount=" + amount + ", TransactionId=" + TransactionId
				+ ", response=" + response + "]";
	}
	
	
}
