package com.revature.employee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
	
	private int employees_id;
	private String firstName;
	private String lastName;
	private int roleId;
	
	//logininfo
	private String userName;
	private String password;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employees_id, String firstName, String lastName, int roleId, String userName, String password) {
		super();
		this.employees_id = employees_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.roleId = roleId;
		this.userName = userName;
		this.password = password;
	}
	public int getEmployees_id() {
		return employees_id;
	}
	public void setEmployees_id(int employees_id) {
		this.employees_id = employees_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "Employee [employees_id=" + employees_id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", roleId=" + roleId + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
		


	
	

}//end employee

