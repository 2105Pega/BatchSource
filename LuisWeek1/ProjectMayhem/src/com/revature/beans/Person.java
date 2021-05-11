package com.revature.beans;

public class Person {
	private String name;
	private int age;
	private int weight;
	static private String homePlanet = "Earth";
	
	public static String getHomePlanet() {
		return homePlanet;
	}

	//no-args constructor
	public Person() {
		super();
	}
	
	public Person(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

	
	
}
