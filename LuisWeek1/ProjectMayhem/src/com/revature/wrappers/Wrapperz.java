package com.revature.wrappers;

public class Wrapperz {
	
	
	
	static int myInt = 3;
	static double myDouble = 8.7;
	static Integer myInteger = 5;
	
	public static void main(String[] args) {
		int result = addEmUp(myInt, myInteger);
		System.out.println(result);
		int result2 = addEmUp2(4,6);
		System.out.println(result2);
		

	}
	
	public static int addEmUp(int a, int b) {
		return a + b;
	}
	public static int addEmUp2(Integer a, Integer b) {
		return a + b;
	}
}
