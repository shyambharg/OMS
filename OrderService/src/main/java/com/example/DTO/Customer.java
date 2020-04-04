package com.example.DTO;


public class Customer {
	Long customerId;
	String customerName;
	String customerEmail;
	String customerPassword;
	Long customerPhone;
	Long customerPincode;
	
	
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
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
	public Long getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(Long customerPhone) {
		this.customerPhone = customerPhone;
	}
	public Long getCustomerPincode() {
		return customerPincode;
	}
	public void setCustomerPincode(Long customerPincode) {
		this.customerPincode = customerPincode;
	}

}
