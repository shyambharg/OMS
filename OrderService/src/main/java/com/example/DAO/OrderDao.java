package com.example.DAO;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import com.example.DTO.Order;
import com.example.DTO.Product;

public interface OrderDao {
	
	public void createOrder(String customerEmail,BigInteger productId);
	
	public List<Order> displayOrder();
	
	
	public List<Map<String ,Object>> displayByCustomerEmail(String customerEmail);
	
}
