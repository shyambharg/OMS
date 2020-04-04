package com.example.service;

import java.util.List;

import com.example.DTO.Salesman;

public interface AdminService {
	
	public void createSalesService(String salesName,String salesEmail,Integer salesPincode,String salesPassword);
	public void editSalesService(String salesEmail,String newSalesName,String newSalesEmail,Integer newSalesPincode,String newSalesPassword);
	public Salesman getSalesService(String salesEmail);
	public List<Salesman> displaySalesService();
	public void deleteSalesService(String salesEmail);
}
