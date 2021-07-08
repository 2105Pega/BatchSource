package com.revature.wrappers;

public class Wrapperz {
	
	/*Wrapper Classes
	 * Character - char
	 * Boolean - boolean
	 * Byte - byte
	 * Short - short
	 * Integer -int
	 * Long - long
	 * Float- float
	 * Double - double
	 */
	static int myInt=3;
	static double myDouble= 8.7;
	static Integer myInteger= 5;
	
	public static void main(String[] args) {
		//(Auto)unboxing- Reference type to primitive
		int result= addEmUp(myInt,myInteger);
		System.out.println(result);
		
		//(Auto) boxing- primitive type to reference/wrapper
		int result2= addEmUp2(4,6);
		System.out.println(result2);
		
		
	}
	
	public static int addEmUp(int a, int b) {
		return a+b;
	}
	public static int addEmUp2(Integer a, Integer b) {
		return a+b;
	}
}
