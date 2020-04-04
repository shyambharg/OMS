package com.example.DTO;

import java.math.BigInteger;

public class Order {
	
	BigInteger orderId;
	String customerEmail;
	BigInteger productId;
	Product objProduct;
	Customer objCustomer;
	
	
	
	public Customer getObjCustomer() {
		return objCustomer;
	}
	public void setObjCustomer(Customer objCustomer) {
		this.objCustomer = objCustomer;
	}
	public Product getObjProduct() {
		return objProduct;
	}
	public void setObjProduct(Product objProduct) {
		this.objProduct = objProduct;
	}
	public BigInteger getOrderId() {
		return orderId;
	}
	public void setOrderId(BigInteger orderId) {
		this.orderId = orderId;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public BigInteger getProductId() {
		return productId;
	}
	public void setProductId(BigInteger productId) {
		this.productId = productId;
	}
	
	
}
