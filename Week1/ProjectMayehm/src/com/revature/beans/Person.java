package com.revature.beans;

public class Person {
	//private - access/modification must be done specifically 
	private String name;
	private int age;
	private int weight;
	
	//static variables - values that are not unique to each instance of class object, constant value
	static private String homePlanet="Earth";
	
// this is what default constructor looks like, assigned if there is no other constructor
//	public Person() {
//		
//		super();
//	}
	
	
	//no params constructor
	public Person() {
		super();
	}
	//constructor w/params
	public Person(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	//right click source - have IDE generate getter/setter automatically
	
	//setter function
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	//getter function
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public static String getHomePlanet() {
		return homePlanet;
	}
	
	
	//override java.toString default, right click generate->toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
	
	
}
