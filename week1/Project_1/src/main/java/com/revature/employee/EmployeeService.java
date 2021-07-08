package com.revature.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
	
	private EmployeeDAO eDao = new EmployeeDaoImpl();
	
	
//	public List<Employee> getMy(){
//		Employee e = new Employee(1,"tom","mark",20,"mark1","pass1");
//		Employee e2 = new Employee(2,"tom2","mark2",10,"mark2","pass2");
//		
//		List<Employee> elEmployees = new ArrayList<>();
//		elEmployees.add(e2);
//		elEmployees.add(e);
//		return elEmployees;
//	}
	
	public Employee addEmployee(Employee e)
	{
		//Main we have service class is to add any business logic you want
		return eDao.addEmployee(e);
	}
	
	public String removeEmployee(int e)
	{
		if(eDao.removeEmployee(e))
		{
			return "Employee was successfully removed from the database!";
		}
		else 
		{
			return "Employee was not successful in removing from the database =(";
		}
	}
	
	public List<Employee> getListOfEmployee()
	{
		return eDao.getListOfEmployee();
	}
	
	public Employee findById(int id)
	{
		return eDao.findById(id);
	}
	
	public String getAvgAndSum()
	{
		double[] avgSum = eDao.getAvgAndSum();
		
		return String.format("Average of Employee's salary: $%.2f"
				+ "\nSum of Employee's salary: $%.2f", avgSum[0], avgSum[1]);
		
	}
	
	

}//end class
