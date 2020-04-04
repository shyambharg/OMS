package com.example.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.DTO.Salesman;
import com.example.mapper.SalesmanMapper;

@Repository
public class AdminDaoImplement implements AdminDao{

	@Autowired
	private JdbcTemplate jdbcTemplateObject;

	@Override
	public void createSales(String salesName, String salesEmail, Integer salesPincode,String salesPassword) {
		String SQL = "insert into salesperson (salesName, salesPincode,salesEmail,salesPassword) values (?, ?, ?, ?)";
		      
	 jdbcTemplateObject.update( SQL,salesName,salesPincode,salesEmail,salesPassword );
	}

	@Override
	public void editSales(String salesEmail,String newSalesName, String newSalesEmail, Integer newSalesPincode,String newSalesPassword ) {
		 String SQL = "update salesperson set salesName = ?,salesEmail = ?,salesPassword = ?,salesPincode = ? where salesEmail = ?";
	      jdbcTemplateObject.update(SQL, newSalesName, newSalesEmail,newSalesPassword,newSalesPincode,salesEmail);
	     
	}

	@Override
	public Salesman getSales(String salesEmail) {
		String SQL = "select * from salesperson where salesEmail = ?";
	      Salesman objSalesman = (Salesman)jdbcTemplateObject.queryForObject(SQL,new Object[]{salesEmail},new SalesmanMapper());
	      return objSalesman;

	}

	@Override
	public List<Salesman> displaySales() 
	{
		String SQL = "select * from salesperson";
	      List <Salesman> objSalesman = jdbcTemplateObject.query(SQL,new SalesmanMapper());
	      return objSalesman;
	}

	@Override
	public void deleteSales(String salesEmail) 
	{
		String SQL = "delete from salesperson where salesEmail = ?";
		jdbcTemplateObject.update(SQL, salesEmail);
		     
	}


}
