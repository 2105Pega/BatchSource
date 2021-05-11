package com.revature.wrappers;

public class Wrappers {
	/*char -char
	 * bool - boolean
	 * byte - byte
	 * int - int
	 * long - long
	 * float - float
	 * double	-double 
	 */
	static int myInt = 3;
	static double myDouble = 8.7;
	static Integer myInteger = 5;

	public static void main(String[] args) {
		
		//auto unboxing, reference/wrapper to primitive
		int result = addition(myInt,myInteger);
		System.out.println(result);
		
		// auto boxing: primitive to wrapper
		int result2 = addition2(2,3);
		System.out.println(result2);

	}

	public static int addition(int a, int b) {
		return a + b;
	
	
	}
	
	public static int addition2(Integer a, Integer b) {
			return a + b;
		}
}
