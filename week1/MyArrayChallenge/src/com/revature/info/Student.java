package com.revature.info;

import java.util.ArrayList;

public class Student<T>{
	
	 private String studentName;
	 private int studentID;
	 private ArrayList<Object> studentList = new ArrayList<>();
		
	public void addStudent(String st) {
		studentList.add(st);
	}
	
	public void printStudentList() {
		for(int i=0; i<studentList.size(); i++ ) {
			System.out.println((i+1) + " "+ studentList.get(i));
		}
	}
	
	public Object findStudent(String searchItem) {
		//boolean exists = studentList.contains(searchItem);
		int position = studentList.indexOf(searchItem);
		if(position >= 0) {
			return studentList.get(position);
		}
		
		return null;
		
		
	}
	
		
	 
	 

	 
	 

}
