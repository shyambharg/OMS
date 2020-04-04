package com.example.DAO;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

public interface CustomerDao {
	
	public void createCustomer(String customerName,String customerEmail,String customerPassword,BigInteger customerPhone,BigInteger customerPincode);
	
	public void updateCustomer(String customerEmail,String customerNewName,String customerNewEmail,String customerNewPassword,BigInteger customerNewPhone,BigInteger customerNewPincode);
	
	
//	public void orderByCustomer();
//	
//	public void modifyOrderByCustomer();

}
