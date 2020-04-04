package com.example.rest;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.DTO.Product;
import com.example.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService objProductService;
	
	
	@RequestMapping(value="product/create",method = RequestMethod.POST)
	public void create(@RequestParam String productName,@RequestParam Double productCost,@RequestParam String productExist,@RequestParam String productCategory)
	{
		objProductService.createProductService(productName, productCost, productExist,productCategory);
	}
	
	@RequestMapping(value="product/update/cost",method = RequestMethod.PUT)
	public void updateCost(@RequestParam String productName,@RequestParam Double productCost)
	{
		objProductService.updateProductCostService(productName, productCost);
	}
	
	@RequestMapping(value="product/update/exist",method = RequestMethod.PUT)
	public void updateExist(@RequestParam String productName,@RequestParam String productExist)
	{
		objProductService.updateProductExistService(productName, productExist);	
	}
	
	@RequestMapping(value="product/displayall",method =RequestMethod.GET)
	public List<Product> display()
	{
		return objProductService.displayProductService();
	}
	
	@RequestMapping(value="product/displaybycategory",method =RequestMethod.GET)
	public List<Map<String,Object>> displayByCategeory(@RequestParam String productCategory)
	{
		return objProductService.displayProductCategorywiseService(productCategory);
	}
	
	
	
	
	
	

	
}
