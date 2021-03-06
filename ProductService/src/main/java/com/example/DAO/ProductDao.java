package com.example.DAO;

import java.util.List;
import java.util.Map;

import com.example.DTO.Product;

public interface ProductDao {
		
		public void createProduct(String productName,Double productCost,String productExist,String productCategory);
		
		public void updateProductCost(String productName,Double productCost);
		
		public void updateProductExist(String productName,String productExist);
		
		public List<Product> displayProduct();
		
		public List<Map<String ,Object>> displayProductCategorywise(String productCategory);
		
		
}
