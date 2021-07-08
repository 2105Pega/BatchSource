package com.revature.account;

import java.util.List;

import com.revature.employee.Employee;


public interface AccountDAO {
	
	public List<Account> getListOfAccount();

	public Account findById(int id);
	public Account addAccount(Account e);

}
