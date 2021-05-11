package com.revature.beans;

public class Person {
	// private for abstraction/security
	private String name;
	private int age;
	private int weight;
	static private String homePlanet = "Earth";
	
	public static String getHomePlanet() {
		return homePlanet;
	}

	// no-args constructor
	public Person () {
		super();
	}
	
	// full constructor
	public Person(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;		
	}
	//sets name
	public void setName(String name) {
		this.name = name;
		
	}
	// returns name
	public String getName() {
		return name;
	}
	// sets age
	public void setAge(int age) {
		this.age = age;		
	}
	// returns age
	public int getAge() {
		return age;
	}
	// sets weight
	public void setWeight(int weight) {
		this.weight = weight;
	}
	// returns weight
	public int getWeight() {
		return weight;		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

	
	
	
}
