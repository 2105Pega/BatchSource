// Package- Namespace that organizes related files
package com.revature.driver;
import com.revature.beans.Person;

public class Driver {

	public static void main(String[] args) {
		/* Component Roles
		 * public- accessible by anything
		 * static- belongs to class, don't have to instantiate
		 * void- no return type
		 * main- name of method, main => entry point
		 * String[] args- parameters/arguments
		 */
		System.out.println("Test Works!");
		Person p = new Person("Marcus",22,220);
		System.out.println(p.toString());
		Person p2 = new Person("Matt",3000,160);
		p2.setWeight(30);
		System.out.println(p2.getWeight());
		System.out.println(p.getHomePlanet());
		System.out.println(p2.getHomePlanet());
	}
	/*
	 * Members of a class- can have different forms
	 * Instance variables- property owned by object
	 * Static variables- belongs to class/all instances
	 * Instance methods- behavior owned by object
	 * Static methods- behavior owned by the class
	 * Constructors- instantiate from class with "new"
	 */
	
	
}
