package com.revature.account;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.revature.customer.Customer;


@XmlRootElement
public class Account {
	
	private int account_id;
	protected int balance;
	private int customer_id;
	
	

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Account(int id, int balance, int cust) {
		this.balance = balance;
		this.account_id = id;
		this.customer_id = cust;
	}
	

	public int getCustomer_id() {
		return customer_id;
	}



	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}



	public int getAccount_id() {
		return account_id;
	}


	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}


	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Account [Id=" + account_id + ", balance=" + balance + ", customer_id=" + customer_id + "]";
	}
	

	

}//end account
