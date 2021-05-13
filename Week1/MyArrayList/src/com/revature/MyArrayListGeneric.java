package com.revature;

public class MyArrayListGeneric<T> {
	private T elements[];
	private int currentIndex;
	
	public MyArrayListGeneric() {
		elements = (T[]) new Object[5];
		currentIndex = 0;
	}
	
	public T get(int index) {
		return elements[index];
	}
	
	public void add(T newObject) {
		if (currentIndex == elements.length) {
			//create new larger array
			T newArray[] = (T[]) new Object[elements.length * 2];
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
