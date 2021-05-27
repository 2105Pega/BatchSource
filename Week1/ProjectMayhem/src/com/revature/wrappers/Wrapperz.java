package com.revature.wrappers;

public class Wrapperz {
	/* Wrapper Classes:
	 * Character - char
	 * Boolean - boolean
	 * Byte - byte
	 * Short - short
	 * Integer - int
	 * Long - long
	 * Float - float
	 * Double - double
	 */
	
	static int myInt = 3;
	static double myDouble = 8.7;
	static Integer myInteger = 5;

	public static void main(String[] args) {
		// (Auto)unboxing - Reference type Integer to primitive type int
		int result = addEmUp(myInt, myInteger);
		System.out.println(result);
		// (Auto)boxing - Primitive type int to Reference/Wrapper type Integer
		int result2 = addEmUp2(4, 6);
		System.out.println(result2);
		
		myInteger.toString(); // bunch of stuff to do with a wrapper
	}
	
	public static int addEmUp(int a, int b) {
		return a + b;
	}
	public static int addEmUp2(Integer a, Integer b) {
		return a + b;
	}

}
