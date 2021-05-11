// Package- name space that organizes related files
package com.revature.driver;
import com.revature.beans.Person; // fully qualified class name

public class Driver {	
	/*
	 * Public is accessible by anything
	 * static belongs to the class and is not instantiate
	 * void is no return type
	 * 
	 */
	public static void main(String[] args) {
		
		System.out.println("Project Mayhem is a go!");
		
		Person james = new Person("James", 20, 100);
		Person maude = new Person("Maude", 33, 1304);
				
		System.out.println(maude.getWeight());
		System.out.println(maude.getHomePlanet());
	}			
}
