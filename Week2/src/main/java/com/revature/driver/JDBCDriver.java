package com.revature.driver;

import java.util.ArrayList;
import java.util.List;

import com.revature.model.Employee;
import com.revature.service.EmployeeService;

public class JDBCDriver {
	public static void main(String[] args) {
		EmployeeService empServ = new EmployeeService();
		//Employee emp1 = new Employee(13,"Patrick","Star",4);
		//Employee emp2 = new Employee(12,"Sandy","Cheeks",2);
		
		//System.out.println(empServ.addEmployee(emp1));
		//System.out.println(empServ.removeEmployee(emp1));
		
		/*
		for (Employee emp:empServ.getAllEmployees()) {
			System.out.println(emp);
		}
		*/
		
		
		//System.out.println(empServ.getEmployeeByID(13));
		
		//System.out.println(empServ.getAvgAndSum());
		
		/*
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(1);
		myList.add(2);
		
		for (int x : myList) {
			System.out.println("nice!");
			System.out.println(x);
			
		}
		*/
		
		
		
		List<String> myList = empServ.getFirstNames();
		System.out.println(!myList.isEmpty());
	}	
}
		
