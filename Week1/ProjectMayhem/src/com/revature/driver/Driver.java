//Package- namespace that organizes related files
package com.revature.driver;

import com.revature.beans.Person; //fully qualified class name

public class Driver {
//single line comment
	/*This
	 * is
	 * a
	 * multi
	 * line
	 * comment
	 * woo
	 * 
	 */
	
	/*Naming Conventions
	 * class and projects: Pascal- capitalize each word ex. ProjectMayhem
	 * methods and variables: camelCase- ex firstSecondThird
	 * Package names: all lowercase , separated by periods
	 * constants: ALL_CAPS_LOLZ
	 */
	//Main method is the entry point
	public static void main(String [] bettyWhite) {
		
		/*public- accessible by anything
		 * static- belongs to the class, don't have to instantiate it
		 * void- doesn't return anything
		 * String [] args- parameters/arguments for the method
		 */
		System.out.println("Project Mayhem is a go!");
		
		Person matt= new Person("matt",35,220);
		System.out.println(matt.toString());
		Person james= new Person("James", 300,15);
		james.setWeight(30);
		System.out.println(james.getWeight());
		System.out.println(james.getHomePlanet());
		System.out.println(matt.getHomePlanet());
	}
	/*
	 * Members of a class- can have different forms
	 * Instance variables- property that belongs to a specific object
	 * Static variables-belongs to class/all instances
	 * Instance methods-behavior related to a specific object
	 * Static methods- relative to the entire class
	 * Constructors-instantiates the class using the keyword "new"
	 */
}
