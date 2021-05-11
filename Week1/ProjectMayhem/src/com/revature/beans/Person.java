package com.revature.beans;

public class Person {
	private String name;
	private int age;
	private int weight;
	static private String homePlanet="Earth";
	
	// we have constructor by default if we dont implement it
	
	
	
	public static String getHomePlanet() {
		return homePlanet;
	}

//	public static void setHomePlanet(String homePlanet) {
//		Person.homePlanet = homePlanet;
//	}
	
	

	//no-args constructor
	public Person() {
		super();
//		this.name="matt"
		
	}
	
	//constructor with fields
	public Person(String name, int age, int weight) {
//		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		
	}
	
	
	//setter name
	public void setName(String name) {
		this.name=name;
	}
	
	//getter name
	public String getName() {
		return name;
	}
	
	
	//setter age
	public void setAge(int age) {
		this.age = age;
	}
	
	//getter age
	public int getAge() {
		return age;
	}


	//setter weight
	public void setWeight(int weight) {
		this.weight=weight;
	}
	
	//getter weight
	public int getWeight() {
		return weight;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
}


