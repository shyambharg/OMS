package com.example.DAO;

import java.util.List;

import com.example.DTO.Salesman;

public interface AdminDao {
 
	public void createSales(String salesName,String salesEmail,Integer salesPincode,String salesPassword);
	public void editSales(String salesEmail,String newSalesName,String newSalesEmail,Integer newSalesPincode,String newSalesPassword);
	public Salesman getSales(String salesEmail);
	public List<Salesman> displaySales();
	public void deleteSales(String salesEmail);
}
