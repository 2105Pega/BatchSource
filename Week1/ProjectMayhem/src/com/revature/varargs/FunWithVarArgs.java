package com.revature.varargs;

public class FunWithVarArgs {
	//static or class scope
	static int p;
	
	public static void main(String[] args) {
		vaTest(1,2,3,4,5,6,7,8,9,0);

	}
	
	//local or method scope
	public static void vaTest(int ... v) {
		System.out.print("Number of Args is: "+ v.length + " Contents:");
		//block scope
		for(int x:v) {
			System.out.print(x + " ");
		}
	}

}
