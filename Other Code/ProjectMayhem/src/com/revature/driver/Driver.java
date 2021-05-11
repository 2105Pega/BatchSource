//Package organizes related files (sets folder structure)
package com.revature.driver;

import com.revature.beans.Person;  //ctrl+shift+o after click

public class Driver {
	/*
	 * This is out first "real" Java Project
	 */
	public static void main(String args[]) {
	//public: 	accessible by anything, 
	//Static: Belongs to class, no instantiation needed, 
	//Void: Nothing spit out
	//args is just the input variable name
		
	System.out.println("Project Mayhem is a go!!!!!");
	
	//class:  first letter caps
	//constants:  ALL_CAPS
	//methods/vars:  camelCase
	
	//instance: Unique property value belonging to an object
	//static:  belongs to all class instances  class.method;
	//constructor:  Instantiates class using keyword "new"
	
	//bean: pojo (plain old java object)
	
	//start code here
	
	Person nick = new Person("Nick", 31, 280);
	//click on missing package and hit ctrl+shift+o to import shortcut
	
	System.out.println(nick.toString());
	
	//change my age!
	nick.setAge(25);
	
	System.out.println("My age has changed: "+ nick.getAge());
	System.out.println("I am from the planet " + nick.getPlanet());
			
	}
}
