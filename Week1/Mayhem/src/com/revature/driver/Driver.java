package com.revature.driver;
import com.revature.beans.Person;

public class Driver {
	//single line comment
	
	/* This is
	 * a multiline
	 * comment
	 * 
	 */
	public static void main(String [] args) {
		
		System.out.print("Project Mayhem is a go!");
		Person celina = new Person("Marceline", 59, 140);
		System.out.println(celina.toString());
		
		/*
		 * Members of a class - can have different forms
		 * Instance variables - property that belongs to a specific object
		 * Static variables -belongs to class/all instances
		 * Instance methods - behavior related to a specific object
		 * Static methods - relative 
		 */
		
	}

}
