package com.revature.controllers;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.persistence.internal.oxm.mappings.Login;

import com.revature.customer.Customer;
import com.revature.customer.CustomerService;
import com.revature.employee.Employee;


@Path("/customers")
public class CustomerContoller {
	
	CustomerService custService =  new CustomerService();
	
	
	@GET
	public List<Customer> getListOfCustomer() {
		return custService.getListOfCustomer();
	}
	
	
	@GET
	@Path("/{custId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomer(@PathParam("custId") int id) {
		
		return custService.findById(id);
	}
	
	@Path("/{custId}/accounts")
	public AccountContoller getAccountContoller() {
		return new AccountContoller();
	}
	
	
	@POST
    @Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Customer createCustomer(Customer customer) {
	
		return custService.createCustomer(customer);
	}
	

	//public Login(){}
	
//	@PUT
//	@Path("/{empId}")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public Employee updatEmployee(@PathParam("empId") int id, Employee employee) {
//		employee.setId(id);
//		return empServ.updateEmployee(employee);
//	}
//	
	
	@DELETE
	@Path("/{custId}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteCustomer(@PathParam("custId") int id) {
		custService.deleteCustomer();
	}
	

	

}
