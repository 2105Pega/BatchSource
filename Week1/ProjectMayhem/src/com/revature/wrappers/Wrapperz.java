package com.revature.wrappers;

public class Wrapperz {
	/* Wrapper Classes
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
		// TODO Auto-generated method stub
		//(Auto)unboxing - reference to primitive
		int result = addEmUp(myInt, myInteger);
		System.out.println(result);
		//(Auto)boxing - primitive to reference
	}
	
	public static int addEmUp(int a, int b) {
		return a + b;
	}

}
