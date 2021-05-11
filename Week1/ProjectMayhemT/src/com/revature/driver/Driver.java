//Package-name space that organize related files
package com.revature.driver;

import com.revature.beans.Person;

public class Driver {
// This is a single line comment
	/* This
	 * is
	 * a
	 * multi line comment
	 * 
	 */
       public static void main(String[] args) {
    	   /*Public - accessible by anything
    	    * static - belongs to the class, don't have to instatiate it
    	    * void- doesn't return anything
    	    * String [] args- parameters/arguments for the method
    	    * 
    	    */
     System.out.println("Project Mayhem is a go");
     Person tay = new Person("Tay", 165, 23);
     
     System.out.println(tay.toString());
     Person james = new Person("James", 15, 300);
     james.setWeight(30);
     System.out.println(james.getHomePlanet());
     System.out.println(james.getWeight());
     
       }

}
