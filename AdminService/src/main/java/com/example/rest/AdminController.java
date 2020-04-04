package com.example.rest;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

import com.example.DTO.Salesman;
import com.example.service.AdminService;

@RestController
public class AdminController {
		
	@Autowired
	private AdminService objAdminService;
	
	
	
	@RequestMapping(value="admin/salesMan/insert",method = RequestMethod.POST)
	public void insert(@RequestParam String salesEmail,@RequestParam String salesName,@RequestParam String salesPassword,@RequestParam Integer salesPincode)
	{
		objAdminService.createSalesService(salesName, salesEmail, salesPincode, salesPassword);
	}
	
	@RequestMapping(value="admin/salesMan/update",method=RequestMethod.POST)
	public void update(@RequestParam String salesEmail,@RequestParam String salesNewEmail,@RequestParam String salesNewName,@RequestParam String salesNewPassword,@RequestParam Integer salesNewPincode)
	{
		objAdminService.editSalesService(salesEmail, salesNewName, salesNewEmail, salesNewPincode, salesNewPassword);
	}
	
	@RequestMapping(value="admin/salesMan/delete", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@RequestParam String salesEmail) {
		try
		{
			objAdminService.deleteSalesService(salesEmail);
			return ResponseEntity.ok().build();
		}
		catch(ResourceAccessException e)
		{
			return ResponseEntity.notFound().build();
		}
		
	}
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON,method = RequestMethod.GET,value = "admin/salesMan/listall")	
	public List<Salesman> list(){
		return objAdminService.displaySalesService();
	}

	@RequestMapping(value="admin/salesMan/get", method = RequestMethod.GET)
	public Salesman get(@RequestParam String salesEmail) {
		return objAdminService.getSalesService(salesEmail);
	}
	
	
	
}
