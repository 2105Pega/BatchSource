package com.revature.varargs;
//var arguments can have 0 to infinity inputs for a method.  Can be any type

public class FunWithVarArgs {
	
	//static scope
	static int v;

	public static void main(String[] args) {
		
	
		
		vaTest(1,2,3,4);

	}

	public static void vaTest(int... v) { //variable must be last argument in parentheses
		System.out.println("Number of args is " + v.length + "" + "contents:");
		for(int x:v) { System.out.print(x+"");
			
		}
	}
}
