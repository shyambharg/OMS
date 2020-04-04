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
		objCustomer.setCustomerId(BigInteger.valueOf(rs.getInt("customerId")));
		objCustomer.setCustomerName(rs.getString("customerName"));
		objCustomer.setCustomerPassword(rs.getString("customerPassword"));
		objCustomer.setCustomerPhone(BigInteger.valueOf(rs.getInt("customerPhone")));
		objCustomer.setCustomerPincode(BigInteger.valueOf(rs.getInt("customerPincode")));
		return objCustomer;
	}

}
