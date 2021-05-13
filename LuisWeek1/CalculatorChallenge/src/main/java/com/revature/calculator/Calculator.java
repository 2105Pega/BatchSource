package com.revature.calculator;

public class Calculator {
	public static int calculate(String s) {
		int index = Calculator.findOperatorIndex(s);
		if(index == -1) {
			return -1;
		}
		
		int num1 = Integer.valueOf(s.substring(0, index).split(" ")[0]);
		char operator = s.charAt(index);
		String[] remainder = s.substring(index + 1).split(" ");
		
		int num2 = Integer.valueOf(remainder[remainder.length - 1]);
		
		switch (operator) {
		
		case '+':
			return num1 + num2;
		case '-':
			return num1 - num2;
		case '*':
			return num1 * num2;
		case '/':
			return num1 / num2;
		default:
			return num1 % num2;
		
		}
		
		
	}

	public static int findOperatorIndex(String s) {

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/'
					|| s.charAt(i) == '%') {
				return i;
			} 
		
		}
		return -1;
	}
}
