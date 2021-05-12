/**
 * 
 */
package com.revature.beans;

/**
 * @author Ronsard Malonda
 *
 */
public class Person {
	private String firstName;
	private String lastName;

	
	public Person() {
		super();
	}
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

	}
	
	public void setName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getfirstName() {
		return this.firstName;
	}
	

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Person [Firstname =" + firstName + " LastName = " + lastName + "]";
	}
}

