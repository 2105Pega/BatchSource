package com.revature.driver;

import com.revature.beans.Person;//fully qualified class name

public class Driver {
	public static void main(String[] args) {
		/* Naming Conventions
		 * classes and projects - PascalCase capitalize each word
		 * methods and variables - camelCase firstSecondThird
		 * constants - all caps
		 */
		Person matt = new Person("matt", 35, 220);
		System.out.println(matt);
		Person james = new Person("james", 300, 15);
		james.setWeight(30);
		System.out.println(james.getWeight());
		//final class cannot be extended
		//final methods cannot be overwritten
		//final variables cannot be changed once assigned
	}
}
