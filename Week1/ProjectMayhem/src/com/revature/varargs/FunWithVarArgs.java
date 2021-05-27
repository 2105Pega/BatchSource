package com.revature.varargs;

public class FunWithVarArgs {
	// Methods that can take in a variable number of arguments
	
	// Static scope
	static int p;
	public static void main(String[] args) {
		vaTest(1,2,3,4,5,6,7,8,9,10);
		vaTest();
	}
	
	/* VarArg MUST be the last argument in the method, and only one per parameterss
	 * Not acceptable:
	 * public static void vaTest(int ... v, int w) {}
	 */
	
	// Local or Method scope
	public static void vaTest(int ... v) {
		System.out.println("Number of args is: " + v.length);
		System.out.print("Contents:");
		// Block scope
		for(int x:v) {
			System.out.print(" " + x);
		}
		System.out.println("");System.out.println("");
	}
	
	
}
