package com.example.DTO;

public class Salesman {
	private Integer salesId;
	private String salesName;
	private Integer salesPincode;
	private String salesEmail;
	private String salesPassword;
	
	public String getSalesPassword() {
		return salesPassword;
	}
	public void setSalesPassword(String salesPassword) {
		this.salesPassword = salesPassword;
	}
	public Salesman()
	{}
	public int getSalesId() {
		return salesId;
	}
	public void setSalesId(int salesId) {
		this.salesId = salesId;
	}
	public String getSalesName() {
		return salesName;
	}
	public void setSalesName(String salesName) {
		this.salesName = salesName;
	}
	public int getSalesPincode() {
		return salesPincode;
	}
	public void setSalesPincode(int salesPincode) {
		this.salesPincode = salesPincode;
	}
	public String getSalesEmail() {
		return salesEmail;
	}
	public void setSalesEmail(String salesEmail) {
		this.salesEmail = salesEmail;
	}
	
	
}
