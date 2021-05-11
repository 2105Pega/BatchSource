package com.revature.beans;

public class Person {
 private String name;
 private int weight;
 private int age;
 static private String homePlanet = "Earth";
 
 public static String getHomePlanet() {
	return homePlanet;
}


//no args constructor
 public Person() {
	 
 } 
 
 //parameters constructors
 public Person(String name, int weight, int age) {
	  this.name=name;
	  this.age=age;
	  this.weight=weight;
	  
  }
  //getters and setters
  public void setname(String name) {
	  this.name=name;
     
  }
  

 public void setWeight(int weight) {
	this.weight = weight;
}

public void setAge(int age) {
	this.age = age;
}

public String getName() {
	  return name;
 }
  public int getAge() {
	  return age;
	  
  }
  public int getWeight() {
	  return weight;
  }


@Override
public String toString() {
	return "Person [name=" + name + ", weight=" + weight + ", age=" + age + "]";
}



  
}


