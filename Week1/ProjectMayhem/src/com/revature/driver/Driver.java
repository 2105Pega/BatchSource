//Package - namespace that organizes related files
package com.revature.driver;


//this is package with class name = "fully qualified class name"; (import)
import com.revature.beans.Person;

public class Driver {
//single line comment
	
	/* This
	  is
	  a 
	  multi
	  line
	  comment
	  woo
	 */
	
	/*Naming conventions
	 * class and project - Pascal convention ProjectMayhem
	 * method and variable: camelCase
	 * package names: all lowercase , separated by periods
	 * constants: ALL_CAPS_LOL
	 * 
	 * 
	 * members of class - can have different forms
	 * 
	 * instance variables - property that belongs to specific object
	 * static var - belongs to class/all instances
	 * 
	 * instance methods - behavior related to a specific object
	 * static methods - relative to the entire class
	 * 
	 * constructors - instantiates the class using the keyword "new";
	 * can accept parameter, but returns something;
	 * constructor is a method ?! kind of
	 */
	
	//Main method is the entry point
	
	
	
	public static void main(String[] args) {
		/* public - accessible by anything
		 * static - belongs to the class, don't have to instantiate it
		 * void - doesn't return anything
		 * String [] args - parameters/arguments for the method
		 * args - just a name by which we reference arguments; 
		 * it can be any name, e.g. "bettyWhite"
		 */
		
		System.out.println("Project Mayhem is a go!");
		
		Person matt = new Person("matt", 35, 170);
		System.out.println(matt.toString());
		
		Person james= new Person("James", 300, 15);
		james.setWeight(30);
		System.out.println(james.getWeight());
		System.out.println(james.getHomePlanet());
		System.out.println(matt.getHomePlanet());
		
	}
}
