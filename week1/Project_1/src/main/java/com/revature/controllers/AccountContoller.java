package com.revature.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.revature.account.Account;
import com.revature.account.AccountService;
import com.revature.customer.Customer;
import com.revature.customer.CustomerService;
import com.revature.employee.Employee;

@Path("/")
public class AccountContoller {
	
	
	AccountService accService = new AccountService();
	CustomerService custServ  = new CustomerService();
	
	@GET
	public List<Account> getListOfAccount() {
		return accService.getListOfAccount();
	}
	
	
	@GET
	@Path("/{accId}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Account> getListOfAccount(@PathParam("custId") int id) {
		List<Account> account = new ArrayList<Account>();
		try {
			
		for(Account acc: accService.getListOfAccount()) {
			
			if(acc.getCustomer_id() == getCustomer(id).getCustomer_id()) {
			//	System.out.println("\tAccount ID: " + acc.getAccount_id() +"\tAccount balance: " + acc.getBalance());
				account.add(acc);
			}
		

	    }
		    
		} catch (Exception e) {
			// TODO: handle exception
		}
    
		    
		return account;
	}
	
	
	public Customer getCustomer(int id) {
		return custServ.findById(id);
		
	}
	
	@POST
    @Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Account addAccount(Account acc) {
	
		return accService.addAccount(acc);
	}
	
	
	

}//end
