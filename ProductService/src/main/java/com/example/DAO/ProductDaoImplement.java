package com.example.DAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.DTO.Product;
import com.example.mapper.ProductMapper;

@Repository
public class ProductDaoImplement implements ProductDao{

	@Autowired
	private JdbcTemplate jdbcTemplateObject;
	
	@Override
	public void createProduct(String productName, Double productCost, String productExist,String productCategory) {
		String SQL = "insert into product (productName,productCost,productExist,productCategory) values (?, ?, ?, ?)";
	      
		 jdbcTemplateObject.update( SQL,productName,productCost,productExist,productCategory);
		
	}

	@Override
	public void updateProductCost(String productName, Double productCost) {
		
		String SQL = "update product set productCost=? where productName = ?";
	      jdbcTemplateObject.update(SQL,productCost,productName);

		
	}

	@Override
	public void updateProductExist(String productName, String productExist) {
		String SQL = "update product set productExist=? where productName = ?";
	      jdbcTemplateObject.update(SQL,productExist,productName);

	}

	@Override
	public List<Product> displayProduct() {
		String SQL= "select * from product";
		 List <Product> objProduct = jdbcTemplateObject.query(SQL,new ProductMapper());
		return objProduct;
	}

	@Override
	public List<Map<String, Object>> displayProductCategorywise(String productCategory) {
		String SQL = "select * from product where productCategory = ?";
	    List<Map<String,Object>> objProduct = jdbcTemplateObject.queryForList(SQL,productCategory);
		return objProduct;
	}
	
	
}
