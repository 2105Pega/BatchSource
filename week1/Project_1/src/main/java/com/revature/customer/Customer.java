package com.revature.customer;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

import com.revature.account.Account;

@XmlRootElement
public class Customer implements Serializable{
	
	private int customer_id;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;

	
	private static NumberFormat formatter = new DecimalFormat("#0.00");


	public Customer(int customer_id, String firstName, String lastName, String userName, String password) {
		super();
		this.customer_id = customer_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
	}


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
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
		return "Customer [customer_id=" + customer_id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", userName=" + userName + ", password=" + password + "]";
	}
	
	
	

	
	
	
	
	

}//end customer
