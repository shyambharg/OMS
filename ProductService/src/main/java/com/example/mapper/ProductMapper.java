package com.example.mapper;

import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.DTO.Product;

public class ProductMapper implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product objProduct = new Product();
		objProduct.setProductId(BigInteger.valueOf(rs.getInt("productId")));
		objProduct.setProductName(rs.getString("productName"));
		objProduct.setProductCost(rs.getDouble("productCost"));
		objProduct.setProductCategory(rs.getString("productCategory"));
		objProduct.setProductExist(rs.getString("productExist"));
		return objProduct;
	}

}
