package com.revature.dao;

import java.util.List;

import com.revature.model.Employee;

public interface EmployeeDao {
	public boolean addEmployee(Employee e);
	public boolean removeEmployee(Employee e);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeByID(Integer id);
	public double[] getAvgAndSum();
	public boolean deleteSpongebob();
	public List<String> getFirstNames();
}
