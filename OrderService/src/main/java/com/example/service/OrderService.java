package com.example.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import com.example.DTO.Order;

public interface OrderService {
	
	public void createOrderService(String customerEmail,BigInteger productId);
	
	public List<Order> displayOrderService();
	
	public List<Map<String ,Object>> displayByCustomerEmailService(String customerEmail);
	

}
