package com.microservices.common;


public class Payment {

	private int paymentId;
	private String status;
	private String tranasctionId;
	
	//To add details of the order
	private int orderId;
	private double amount;
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTranasctionId() {
		return tranasctionId;
	}
	public void setTranasctionId(String tranasctionId) {
		this.tranasctionId = tranasctionId;
	}
	public Payment(int paymentId, String status, String tranasctionId, int orderId, int amount) {
		super();
		this.paymentId = paymentId;
		this.status = status;
		this.tranasctionId = tranasctionId;
		this.orderId = orderId;
		this.amount = amount;
	}
	public Payment() {
		super();
	}
}
