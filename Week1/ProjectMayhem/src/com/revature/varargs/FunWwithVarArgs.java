package com.revature.varargs;

public class FunWwithVarArgs {
	public static void main(String[] args) {
		vaTest(1, 2, 3, 4);
	}
	
	public static void vaTest(int ... v) {
		System.out.println("Number of args is " + v.length);
		for (int x : v) {
			System.out.println(x);
		}
	}
}
