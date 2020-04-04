package com.example.feign.client;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name="Product-Service",url="http://localhost:8093")
public interface ProductClient {
	
	@RequestMapping(value="product/displayall",method =RequestMethod.GET)
	public List<Object> displayProduct();
	
	@RequestMapping(value="product/displaybycategory",method =RequestMethod.GET)
	public List<Map<String,Object>> displayByCategeory(@RequestParam String productCategory);
	
}
