package com.example.feign;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="Order-Service",url="http://localhost:8094")
public interface OrderClient {
	
	@RequestMapping(value="order/displaybycustomeremail",method=RequestMethod.GET)
	public List<Map<String,Object>> displayOrderByCustomerEmail(@RequestParam String customerEmail);
	
	
	@RequestMapping(value="order/displayall",method=RequestMethod.GET)
	public List<Object> displayOrder();
	
}
