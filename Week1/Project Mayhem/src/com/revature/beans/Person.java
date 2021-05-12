package com.revature.beans;

import java.io.Serializable;

public class Person implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7581317131704330481L;
	private String name;
	private int age;
	private int weight;


	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	
	public int getWeight() {return weight;}
	public void setWeight(int weight) {this.weight = weight;}
	
	public Person() //No Args Constructor
	{ 
		super();
	}
	
	public Person(String name, int age, int weight) //Args
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

	
	

}
