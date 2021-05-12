/**
 * 
 */
package com.revature.beans;


/**
 * @author Ronsard Malonda
 *
 */
public class BankAccount {
	private double balance = 0.0;
	
	public BankAccount() {
		
	}
	public BankAccount(double balance) {
		this.balance = balance;
		
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance ;
	}
	
	@Override
	public String toString() {
		return "Your balance is : " + this.balance ;
	}

}
