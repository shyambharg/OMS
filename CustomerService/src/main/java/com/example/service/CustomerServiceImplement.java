package com.example.service;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.CustomerDao;

@Service
public class CustomerServiceImplement implements CustomerService{

	@Autowired
	private CustomerDao objCustomerDao;
	@Override
	public void createCustomerService(String customerName, String customerEmail, String customerPassword,
			BigInteger customerPhone, BigInteger customerPincode) {
		objCustomerDao.createCustomer(customerName, customerEmail, customerPassword, customerPhone, customerPincode);
	}

	@Override
	public void updateCustomerService(String customerEmail, String customerNewName, String customerNewEmail,
			String customerNewPassword, BigInteger customerNewPhone, BigInteger customerNewPincode) {
		
		objCustomerDao.updateCustomer(customerEmail, customerNewName, customerNewEmail, customerNewPassword, customerNewPhone, customerNewPincode);
		
	}

}
