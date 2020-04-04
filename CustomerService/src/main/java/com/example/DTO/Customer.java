package com.example.DTO;

import java.math.BigInteger;

public class Customer {
	BigInteger customerId;
	String customerName;
	String customerEmail;
	String customerPassword;
	BigInteger customerPhone;
	BigInteger customerPincode;
	
	
	public BigInteger getCustomerId() {
		return customerId;
	}
	public void setCustomerId(BigInteger customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public BigInteger getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(BigInteger customerPhone) {
		this.customerPhone = customerPhone;
	}
	public BigInteger getCustomerPincode() {
		return customerPincode;
	}
	public void setCustomerPincode(BigInteger customerPincode) {
		this.customerPincode = customerPincode;
	}
	
	
}
