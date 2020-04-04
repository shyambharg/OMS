package com.example.DAO;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.DTO.Order;
import com.example.DTO.Product;
import com.example.mapper.OrderMapper;

@Repository
public class OrderDaoImplement implements OrderDao {

	@Autowired
	private JdbcTemplate jdbcTemplateObject;
	
	
	@Override
	public void createOrder( String customerEmail, BigInteger productId) {
		
		String SQL = "insert into customerorder (customerEmail,productId) values (?,?)";
		jdbcTemplateObject.update(SQL,customerEmail,productId);
	}

	@Override
	public List<Order> displayOrder() {
		String SQL = "SELECT customerorder.*,customer.*,product.* FROM customerorder  LEFT OUTER JOIN customer ON customerorder.customerEmail = customer.customerEmail LEFT OUTER JOIN product ON customerorder.productId = product.productId";
		List <Order> objOrder = jdbcTemplateObject.query(SQL,new OrderMapper());
		return objOrder;
	}

	@Override
	public List<Map<String, Object>> displayByCustomerEmail(String customerEmail) {
			String SQL= "SELECT customerorder.*,product.* FROM customerorder LEFT OUTER JOIN product ON customerorder.productId = product.productId where customerEmail=? ";
			List<Map<String,Object>> objList= jdbcTemplateObject.queryForList(SQL,customerEmail);
			return objList;
	}

	

}
