package com.example.service;

import java.math.BigInteger;

public interface CustomerService {

	public void createCustomerService(String customerName,String customerEmail,String customerPassword,BigInteger customerPhone,BigInteger customerPincode);
	
	public void updateCustomerService(String customerEmail,String customerNewName,String customerNewEmail,String customerNewPassword,BigInteger customerNewPhone,BigInteger customerNewPincode);
	
//	public void orderByCustomerService();
//	
//	public void modifyOrderByCustomerService();

}
