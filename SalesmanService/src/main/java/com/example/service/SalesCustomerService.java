package com.example.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import com.example.DTO.Customer;

public interface SalesCustomerService {

	public List<Map<String ,Object>> displayCustomerService(BigInteger salesPincode);
	
	public void approveCustomerService();
}
