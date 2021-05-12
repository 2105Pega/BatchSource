package com.revature.wrappers;

public class Wrapperz {
	
	/* Wrapper Classes
	 * Character - char
	 * Boolean -boolean
	 * Byte - byte
	 * Short - short
	 * Integer - int
	 * Long - long
	 * Float - float
	 * Double -double
	 */
	static int myInt = 3;
	static double myDouble=8.7;
	static Integer myIntager =5;

	public static void main (String[] args) {
		int result = addEmUp(myInt,myIntager);
		System.out.println(result);
	}
	
	
	// (Auto) Unboxing- Reference type to primitive
	public static int addEmUp(int a, int b) {
		return a+b;
	}
	// (Auto) Boxing - primitive to reference
	public static int addEmUp2(Integer a, Integer b) {
		return a+b;
	}
}
