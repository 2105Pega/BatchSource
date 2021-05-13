package com.revature;

public class MyArrayList {
	private Object elements[];
	private int currentIndex;
	
	public MyArrayList() {
		elements = new Object[5];
		currentIndex = 0;
	}
	
	public Object get(int index) {
		return elements[index];
	}
	
	public void add(Object newObject) {
		//check if array is full
		if (currentIndex == elements.length) {
			//create new larger array
			Object newArray[] = new Object[elements.length * 2];
			//copy old array into new array
			for(int i = 0; i < elements.length; i++) {
				newArray[i] = elements[i];
			}
			elements = newArray;
			System.out.println("array size increased to " + elements.length);
		}
		elements[currentIndex] = newObject;
		currentIndex++;
	}
}
