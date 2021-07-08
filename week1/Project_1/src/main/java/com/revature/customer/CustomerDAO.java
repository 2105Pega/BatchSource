package com.revature.customer;

import java.util.List;

import com.revature.account.Account;

public interface CustomerDAO {
	
	public List<Customer> getListOfCustomer();
	public boolean createAccount(double amount, int id);
	public boolean depositAccount(Customer customer, double amount);
	public boolean withdrawAccount(Customer customer, double amount);
	public boolean checkCredentials();
	public Customer createCustomer(Customer customer);
	public boolean deleteAccount(int acc);

}//end interface
