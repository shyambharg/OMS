package com.example.mapper;

import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.DTO.Customer;
import com.example.DTO.Order;
import com.example.DTO.Product;

public class OrderMapper implements RowMapper<Order> {

	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
		Order objOrder = new Order();
		objOrder.setOrderId(BigInteger.valueOf(rs.getInt("orderId")));
		objOrder.setCustomerEmail(rs.getString("customerEmail"));
		objOrder.setProductId(BigInteger.valueOf(rs.getInt("productId")));
		
		Customer objCustomer = new Customer();
		objCustomer.setCustomerEmail(rs.getString("customerEmail"));
		objCustomer.setCustomerId(rs.getLong("customer.customerId"));
		objCustomer.setCustomerName(rs.getString("customer.customerName"));
		objCustomer.setCustomerPassword(rs.getString("customer.customerPassword"));
		objCustomer.setCustomerPhone(rs.getLong("customer.customerPhone"));
		objCustomer.setCustomerPincode(rs.getLong("customer.customerPincode"));
		objOrder.setObjCustomer(objCustomer);
		
		Product objProduct = new Product();
		objProduct.setProductId(rs.getLong("productId"));
		objProduct.setProductName(rs.getString("product.productName"));
		objProduct.setProductCost(rs.getDouble("product.productCost"));
		objProduct.setProductExist(rs.getString("product.productExist"));
		objProduct.setProductCategory(rs.getString("product.productCategory"));
		objOrder.setObjProduct(objProduct);
		
		
		return objOrder;
	}

}
