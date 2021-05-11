//Package - Namespace that organizes related files
package com.revature.driver;

// Fully Qualified Class Name:
import com.revature.beans.Person;

/* Naming Conventions:
 * Classes and Projects - Pascal (FirstSecondThird)
 * Methods and Variables - Camel Case (firstSecondThird)
 * Package Names - all lowercase, separated by dot (com.first.second.third)
 * Constants - all uppercase, separated by underscore (FIRST_SECOND_THIRD) 
 */

/* Instance Variables - property that belongs to a specific object
 * Static variables - belongs to a class (all instances too)
 * Instance Methods - behavior related to a specific object
 * Static Methods - relative to the entire class
 * Constructors - instantiates a class with the keyword "new"
 */

public class Driver {

	public static void main(String args[]) {
		/* Public - accessible by anything
		 * Static - belongs to the class, no instantiation needed
		 * Void - doesn't return anything
		 * String args[] - parameters/arguments for the main method
		 */
		
		System.out.println("Project Mayhem is a GO");
		
		Person kyle = new Person("Kyle", 23, 170);
		System.out.println(kyle.toString());
		
		kyle.setWeight(180);
		System.out.println("Kyle now weighs " + kyle.getWeight());
		System.out.println("Kyle lives on " + kyle.getHomePlanet());
	}
	
}
