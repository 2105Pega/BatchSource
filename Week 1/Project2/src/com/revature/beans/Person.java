package com.revature.beans;

public class Person {
	//Properties
	private String name;
	private int age;
	private int weight;
	static private String homePlanet = "Earth";
	
	
	//Constructors
	// No-Args constructor
	public Person() {
		super();
	}
	public Person(String name,int age,int weight) {
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	

	//Methods
	// Name modifiers
	public String setName(String newName) {
		String r = name;
		name = newName;
		return r;
	}
	public String getName() {
		return name;
	}
	// Age modifiers
	public void birthday() {
		age++;
	}
	public int setAge(int newAge) {
		int r = age;
		age = newAge;
		return r;
	}
	public int getAge() {
		return age;
	}
	// Weight modifiers
	public int setWeight(int newWeight) {
		int r = weight;
		weight=newWeight;
		return r;
	}
	public int getWeight() {
		return weight;
	}
	// Home Planet Modifiers
	public static String getHomePlanet() {
		return homePlanet;
	}
	// Object method overrides
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + ", homePlanet="+homePlanet+"]";
	}

}
