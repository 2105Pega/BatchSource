package com.jacob.controllers;

// For Jackson, either have public members or public getters and setters
public class User {

	private String name;
	public int age;
	public String email;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
