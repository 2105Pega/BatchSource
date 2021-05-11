package com.revature.varargs;

public class FunWithVarArgs {

	public static void main(String[] args) {
		
		//vaTest(1,2,3,4,5,6,7,8,9,0);
		vaTest();
	}

	// must be last arguement
	public static void vaTest(int ... v) {
		System.out.println("Number of Args is : " + v.length + " Contents:");
		
		for(int x:v) {
			System.out.print(x + " ");
			
		}
	}
}
