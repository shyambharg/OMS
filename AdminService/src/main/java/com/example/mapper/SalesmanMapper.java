package com.example.mapper;


import com.example.DTO.Salesman;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SalesmanMapper implements RowMapper<Salesman>{

	@Override
	public Salesman mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Salesman objSalesman = new Salesman();
		  objSalesman.setSalesId(rs.getInt("salesId"));
		  objSalesman.setSalesName(rs.getString("salesName"));
		  objSalesman.setSalesEmail(rs.getString("salesEmail"));
		  objSalesman.setSalesPincode(rs.getInt("salesPincode"));
		  objSalesman.setSalesPassword(rs.getString("salesPassword"));
		return objSalesman;
	}


}
