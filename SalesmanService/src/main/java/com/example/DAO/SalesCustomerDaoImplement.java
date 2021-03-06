package com.example.DAO;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.DTO.Customer;
import com.example.mapper.CustomerMapper;

@Repository
public class SalesCustomerDaoImplement implements SalesCustomerDao {
	
	@Autowired
	private JdbcTemplate objJdbcTemplate;
	
	@Override
	public List<Map<String ,Object>> displayCustomer(BigInteger salesPincode)
		{
		String SQL = "select * from customer where customerPincode = ?";
	    List<Map<String,Object>> objCustomer = objJdbcTemplate.queryForList(SQL,salesPincode);
	    return objCustomer;
		}

	@Override
	public void approveCustomer() {
		
		String SQL = "update customer set customerIsApprove = 'True' where customerEmail IS NOT NULL and customerPhone IS NOT NULL";
		objJdbcTemplate.update(SQL);
	}
	
	
}
