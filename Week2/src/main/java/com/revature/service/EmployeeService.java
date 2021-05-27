package com.revature.service;

import java.util.List;

import com.revature.dao.EmployeeDao;
import com.revature.dao.EmployeeDaoImpl;
import com.revature.model.Employee;

public class EmployeeService {
	private EmployeeDao eDao = new EmployeeDaoImpl();
	
	public boolean addEmployee(Employee e) {
		return eDao.addEmployee(e);
	}
	
	public String removeEmployee(Employee e) {
		if(eDao.removeEmployee(e)) {
			return "Employee successfully removed";
		} else {
			return "Employee removal failed";
		}
	}
	
	public List<Employee> getAllEmployees() {
		return eDao.getAllEmployees();
	}
	
	public Employee getEmployeeByID(Integer id) {
		return eDao.getEmployeeByID(id);
	}
	
	public String getAvgAndSum() {
		double[] avgSum = eDao.getAvgAndSum();
		
		return String.format("Average of employee salary: $%.2f"
				+ "\nSum of all employee salaries: &%.2f", avgSum[0], avgSum[1]);
	}
	
	public String deleteSpongebob() {
		if (eDao.deleteSpongebob())
			return "Spongebob has been deleted from employees table";
		else 
			return "Spongebob hasn't been deleted. Hes'd still here...";
	}
	
	public List<String> getFirstNames() {
		return eDao.getFirstNames();
	}
}
