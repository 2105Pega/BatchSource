package com.revature.beans;

public class Person {
	
	private String name;
	private int age;
	private int weight;
	static private final String homePlanet = "Earth";
	
	// no args constructor
	public Person() {
		super();
	}
	
	//constructor with fields
	public Person(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public static String getHomePlanet() {
		return homePlanet;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + ", homePlanet = " + homePlanet +  "]";
	}

}
