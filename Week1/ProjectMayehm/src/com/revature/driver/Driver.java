//Package - namespace that organizes related files
package com.revature.driver;

import com.revature.beans.Person; // fully qualified class name

public class Driver {
	//single line comment
	
	/*multi
	 * line
	 * comment
	 */
	/*Naming conventions
	 * class and projects: pascal - capitalize each word
	 * methods and variables - camelCase
	 * package name - all lower case, separated by periods
	 * constants - ALL CAPS
	 */
	
	
	   public static void main (String [] args) {
		   //public - accessible by anything
		   //static - belongs to class, don't have to instantiate
		   //void - no return
		   // String []arg - parameters for your method
		   // args - variable name for array
		   
		   System.out.println("Project Mayhem is a go!");
		  
		   Person Gabriel = new Person("Gabriel", 29, 150);
		   System.out.println(Gabriel.toString());
		   Gabriel.setWeight(0);
		   System.out.println(Gabriel.getHomePlanet());
	}
};
