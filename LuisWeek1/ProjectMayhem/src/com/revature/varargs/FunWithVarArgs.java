package com.revature.varargs;

public class FunWithVarArgs {
	static int p;
	public static void main(String[] args) {
		vaTest(1, 2 ,3, 4, 5, 6, 7, 8, 9, 0);
	}
	
	public static void vaTest(int ... v) {
		System.out.println("number of Args is: " + v.length + " Contents:");
		for(int x:v) {
			System.out.print(x + " ");
		}
	}
}
