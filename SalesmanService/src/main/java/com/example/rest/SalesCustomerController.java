package com.example.rest;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.DTO.Customer;
import com.example.feign.OrderClient;
import com.example.feign.ProductClient;
import com.example.service.SalesCustomerService;

@RestController
public class SalesCustomerController {

	@Autowired
	private SalesCustomerService objSalesCustomer;
	
	@Autowired
	private ProductClient objProductClient;
	
	@Autowired
	private OrderClient objOrderClient;
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON,method = RequestMethod.GET,value = "admin/salesMan/listmycustomers")	
	public List<Map<String ,Object>> list(@RequestParam BigInteger salesPincode){
		return objSalesCustomer.displayCustomerService(salesPincode);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "admin/salesMan/approve")
	public void approve()
	{
		objSalesCustomer.approveCustomerService();
	}
	
	
	@RequestMapping(value="product/create",method = RequestMethod.POST)
	public void create(@RequestParam String productName,@RequestParam Double productCost,@RequestParam String productExist,@RequestParam String productCategory)
	{
		objProductClient.create(productName, productCost, productExist,productCategory);
	}
	
	@RequestMapping(value="product/update/cost",method = RequestMethod.PUT)
	public void updateCost(@RequestParam String productName,@RequestParam Double productCost)
	{
		objProductClient.updateCost(productName, productCost);
	}
	
	@RequestMapping(value="product/update/exist",method = RequestMethod.PUT)
	public void updateExist(@RequestParam String productName,@RequestParam String productExist)
	{
		objProductClient.updateExist(productName, productExist);
	}
	
	
	@RequestMapping(value="salesman/order/displayall",method=RequestMethod.GET)
	public List<Object> displayOrder()
	{
		return objOrderClient.displayOrder();
	}

	@RequestMapping(value="salesman/order/displaybycustomeremail",method=RequestMethod.GET)
	public List<Map<String,Object>> displayOrderByCustomerEmail(@RequestParam String customerEmail)
	{
		return objOrderClient.displayOrderByCustomerEmail(customerEmail);
	}


}
