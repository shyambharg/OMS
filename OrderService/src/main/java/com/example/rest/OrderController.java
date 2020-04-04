package com.example.rest;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.DAO.OrderDao;
import com.example.DTO.Order;
import com.example.DTO.Product;
import com.example.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService objOrderService;
	
	@Autowired
	private OrderDao objOrder; 
	
	@RequestMapping(value="order/createorder",method=RequestMethod.POST)
	public void create(@RequestParam String customerEmail,@RequestParam BigInteger productId)
	{
		objOrderService.createOrderService(customerEmail, productId);
	}

	@RequestMapping(value="order/displayall",method=RequestMethod.GET)
	public List<Order> displayOrder()
	{
		return objOrderService.displayOrderService();
	}
	
	@RequestMapping(value="order/displaybycustomeremail",method=RequestMethod.GET)
	public List<Map<String,Object>> displayOrderByCustomerEmail(@RequestParam String customerEmail)
	{
		return objOrderService.displayByCustomerEmailService(customerEmail);
	}
	
	
	
}
