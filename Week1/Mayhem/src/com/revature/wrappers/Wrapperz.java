package com.revature.wrappers;

public class Wrapperz {
	
	/*Wrapper Classes
	 * Boolean - boolean
	 * 
	 */
	
	static int myInt = 3;
	static double myDouble = 8.7;
	static Integer myInteger = 5;
	
	public static void main(String [] args) {
		//(Auto)unboxing - Reference type to primitive
		int result = addEmUp(myInt,myInteger);
		System.out.println(result);
		
		//(Auto)boxing - Primitive type to Reference
		int result2 = addEmUp(4,6);
		System.out.println(result2);
		
		
	}
	
	public static int addEmUp(int a, int b) {
		return a+b;
	}

}
