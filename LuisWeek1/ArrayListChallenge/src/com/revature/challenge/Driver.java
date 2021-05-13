package com.revature.challenge;

public class Driver {
	public static void main(String[] args) {
		GenericArrayList mine = new GenericArrayList();
		
		mine.add(1);
		mine.add(2);
		mine.add(3);
		mine.add(4);
		mine.add(5);
		mine.add(6);
		for(int i = 0; i< mine.getLength(); i++) {
			System.out.println("This index is: " + mine.get(i));
		}
	}
}
