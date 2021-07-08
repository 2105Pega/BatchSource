package com.revature.account;

import java.util.List;

import com.revature.customer.Customer;
import com.revature.employee.Employee;
import com.revature.employee.EmployeeDAO;
import com.revature.employee.EmployeeDaoImpl;

public class AccountService {
	
	private AccountDAO aDao = new AccountDaoImplement();
	
	public List<Account> getListOfAccount()
	{
		return aDao.getListOfAccount();
	}
	
	public Account findById(int id) {
		return aDao.findById(id);
	}
	
	public Account addAccount(Account e)
	{
		//Main we have service class is to add any business logic you want
		return aDao.addAccount(e);
	}
		

}//end class
