package com.revature.calculator;

public class Calculator {
	
	String test = "1+2";
	int sum = 0;
	
	public void calc(String s) {
		//instantiate holder array and change numeric characters to integers
		int num1[] = new int[s.length()];
		for(int i=0; i<s.length(); i++) {
			if (s.charAt(i) != '+') {
				num1[i] = Character.getNumericValue(s.charAt(i));
			 }
			else {
				i++;
			}
		for(int j = 0; j < num1.length; i++) {
			sum = sum + num1[i];}
		}
		System.out.println(sum);
	}

}
//idea: check if character is a number, begin "recording" if true, stop recording if not.
//Check Erik's solution for reference