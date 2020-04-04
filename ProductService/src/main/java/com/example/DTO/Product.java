package com.example.DTO;

import java.math.BigInteger;

public class Product {
	
	BigInteger productId;
	String productName;
	Double productCost;
	String productExist;
	String productCategory;
	
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public BigInteger getProductId() {
		return productId;
	}
	public void setProductId(BigInteger productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductCost() {
		return productCost;
	}
	public void setProductCost(Double productCost) {
		this.productCost = productCost;
	}
	public String getProductExist() {
		return productExist;
	}
	public void setProductExist(String productExist) {
		this.productExist = productExist;
	}
	
}
