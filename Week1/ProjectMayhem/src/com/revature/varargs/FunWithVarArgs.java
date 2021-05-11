package com.revature.varargs;

public class FunWithVarArgs {
	//static scope
	static int p;
	public static void main(String[] args) {
		
		//vaTest(1,2,3,4,5,6,7,8,9,0);
		vaTest();
	}

	// var args must be last argument
	// local or method scope
	public static void vaTest(int ... v) {
		System.out.println("Number of Args is : " + v.length + " Contents:");
		// block Scope
		for(int x:v) {
			System.out.print(x + " ");
			
		}
	}
}
