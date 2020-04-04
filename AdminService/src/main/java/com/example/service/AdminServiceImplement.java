package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.AdminDao;
import com.example.DTO.Salesman;

@Service
public class AdminServiceImplement implements AdminService{

	@Autowired
	private AdminDao objAdminDao;
	
	@Override
	public void editSalesService(String salesEmail, String newSalesName, String newSalesEmail,
			Integer newSalesPincode, String newSalesPassword) {
		objAdminDao.editSales(salesEmail, newSalesName, newSalesEmail, newSalesPincode, newSalesPassword);
		
	}

	@Override
	public void createSalesService(String salesName, String salesEmail, Integer salesPincode, String salesPassword) {
		objAdminDao.createSales(salesName, salesEmail, salesPincode, salesPassword);
		
	}

	@Override
	public Salesman getSalesService(String salesEmail) {
		return objAdminDao.getSales(salesEmail);
	}

	@Override
	public List<Salesman> displaySalesService() {
		return objAdminDao.displaySales();
	}

	@Override
	public void deleteSalesService(String salesEmail) {
		objAdminDao.deleteSales(salesEmail);
	}

	


}
