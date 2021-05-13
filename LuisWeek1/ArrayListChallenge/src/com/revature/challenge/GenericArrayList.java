package com.revature.challenge;

public class GenericArrayList<T> {
	private Object[] array;
	private int length;
	
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public GenericArrayList() {
		this.array = (T[]) new Object[5];
		this.length = 0;
	}
	public Object get(int index) {
		
		if (index >-1 && index < this.length) {
			return array[index];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	public void add(Object addition) {
		if ((length +1) >= array.length) {
			Object[] arrayCopy = new Object[array.length*2];
			for(int i = 0; i< array.length;i++) {
				arrayCopy[i] = array[i];
			}
			array = arrayCopy;
			array[length] = addition;
			length++;
			
		} else {
			array[length] = addition;
			length++;
		}
	}
	
	
}
