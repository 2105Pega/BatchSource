// Bean - needs private vars, no-args const, fields const, setters/getters and tostring override
package com.revature.beans;

public class Person {
	// Instance or Object scope
	private String name;
	private int age;
	private int weight;
	static private String homePlanet = "Earth";
	
	// no-args (default constructor)
	public Person() {
		super();
	}
	
	// Filled Fields constructor
	public Person(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	// Set/Get name
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	// Set/Get age
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	// Set/Get weight
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}


	// Get Home Planet
	public static String getHomePlanet() {
		return homePlanet;
	}

	// toString override
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
}
