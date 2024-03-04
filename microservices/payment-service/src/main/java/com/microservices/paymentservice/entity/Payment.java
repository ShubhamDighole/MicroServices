package com.microservices.paymentservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="payment")

public class Payment {
	
	@Id
	@GeneratedValue
	private int paymentId;
	private String status;
	private String tranasctionId;
	
	//To add details of the order
	private int orderId;
	private int amount;
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
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
