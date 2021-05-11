package com.revature.beans;

public class Person {
	private String name;
	private int age;
	private int weight;
	public static String inPlanet;
	
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
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return this.weight ;
	}
	
	public String toString() {
		return "Person [name =" + name + " age = " + age + "weight = " + weight + "]";
	}

}
