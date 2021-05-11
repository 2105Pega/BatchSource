package com.revature.beans;

public class Person {
	//these can only be accessed and/or modified under certain condition.
	private String name;
	private int age;
	private int weight;
	static private String homePlanet = "Earth"; //doesn't need a setter, but does need a getter
	
	//no args constructor (default)
	public Person() {
		super();
	}
	
	//to assign values, we need an explicit constructor rather than the default
	public Person (String name, int age, int weight) {
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
	
	public static String getPlanet() {
		return homePlanet;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
	
	

}
