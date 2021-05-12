package com.revature.beans;

public class Person {
	//Instance Scope
	private String name;
	private int age;
	private int weight;
	public int x =7;
	
	public static String getHomePlanet() {
		return homePlanet;
	}


	


	static private String homePlanet="Earth";
	
	//no-args constructor
	public Person() {
		super();
	}
	
	
	public Person(String name, int age, int weight) {
		this.name=name;
		this.age=age;
		this.weight=weight;
		
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


	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}


	
	
	
}
