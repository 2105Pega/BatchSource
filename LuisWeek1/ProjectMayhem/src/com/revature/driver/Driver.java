package com.revature.driver;

import com.revature.beans.Person;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Project Mayhem is a go!");
		Person luis = new Person("Luis", 27, 230);
		System.out.println(luis.toString());
		Person james = new Person("James", 300, 15);
		james.setWeight(30);
		System.out.println(james.getWeight());
		System.out.println(james.getHomePlanet());
	}
}
