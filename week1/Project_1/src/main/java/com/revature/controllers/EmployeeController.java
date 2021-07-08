package com.revature.controllers;

import java.util.List;
import java.util.Scanner;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.revature.account.AccountService;
import com.revature.customer.Customer;
import com.revature.customer.CustomerService;

import com.revature.employee.Employee;
import com.revature.employee.EmployeeService;


@Path("/employees")
public class EmployeeController {
	final static Logger logger = Logger.getLogger(EmployeeController.class);
	static Scanner scanner = new Scanner(System.in);
	

	EmployeeService empServ = new EmployeeService();
 
	
	
	
	@GET
//	@Path("/employeeList")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getListOfEmployee() {
		return empServ.getListOfEmployee();
	}
	
	@GET
	@Path("/{empId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployee(@PathParam("empId") int id) {
		
		return empServ.findById(id);
	}
	
	@POST
    @Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Employee addEmployee(Employee employee) {
	
		return empServ.addEmployee(employee);
	}
	
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
	@Path("/{empId}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteEmployee(@PathParam("empId") int id) {
		empServ.removeEmployee(id);
	}
	
	
	
	
	

	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String getMess() {
//		return "hello";
//	}

}
