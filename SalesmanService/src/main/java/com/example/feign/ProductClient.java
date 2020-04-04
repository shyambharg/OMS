package com.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name="Product-Service",url="http://localhost:8093")
public interface ProductClient {
	
	@RequestMapping(value="product/create",method = RequestMethod.POST)
	public void create(@RequestParam String productName,@RequestParam Double productCost,@RequestParam String productExist,@RequestParam String productCategory);
	
	@RequestMapping(value="product/update/cost",method = RequestMethod.PUT)
	public void updateCost(@RequestParam String productName,@RequestParam Double productCost);
	
	@RequestMapping(value="product/update/exist",method = RequestMethod.PUT)
	public void updateExist(@RequestParam String productName,@RequestParam String productExist);
	
}
