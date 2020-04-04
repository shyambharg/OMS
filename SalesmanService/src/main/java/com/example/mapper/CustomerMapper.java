package com.example.mapper;

import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.DTO.Customer;

public class CustomerMapper implements RowMapper<Customer>{

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer objCustomer = new Customer();
		objCustomer.setCustomerEmail(rs.getString("customerEmail"));
		objCustomer.setCustomerId(rs.getInt("customerId"));
		objCustomer.setCustomerName(rs.getString("customerName"));
		objCustomer.setCustomerPassword(rs.getString("customerPassword"));
//		objCustomer.setCustomerPhone((rs.getBigDecimal("customerPhone")));
//		objCustomer.setCustomerPincode(rs.getBigDecimal("customerPincode"));
		return objCustomer;
	}

	
}
