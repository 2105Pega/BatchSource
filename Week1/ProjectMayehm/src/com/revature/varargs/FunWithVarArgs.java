package com.revature.varargs;

public class FunWithVarArgs {
	
	public static void main(String[]args) {
		//vaTest(1,2,3,4,5);
		
		vaTest();
		
	}
	
	public static void vaTest(int i, int...v) {
		System.out.println("Number of args is: "+v.length+" Contents:");
		
		for (int x:v) {
			System.out.print(x+" ");
		}
	}

}
