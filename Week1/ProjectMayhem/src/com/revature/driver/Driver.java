//package namespace
package com.revature.driver;

//fully qualified class name
import com.revature.beans.Person;

public class Driver {
	public static void main(String args[]) {
		System.out.println("mayhem");
		Person matt = new Person("Matt", 35, 220);
		System.out.println(matt.toString());
		Person james = new Person("James", 300, 15);
		james.setWeight(30);
		System.out.println(james.getHomePlanet());
	}
}
