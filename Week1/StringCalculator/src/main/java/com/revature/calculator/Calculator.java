package com.revature.calculator;

public class Calculator {
	
	public Calculator() {
		super();
	}
	
	public int calculate(String input) {
		int ans = 0;
		String[] inputArr;
		inputArr = input.split(" ");
		Integer first = Integer.parseInt(inputArr[0]);
		Integer second = Integer.parseInt(inputArr[2]);
		switch(inputArr[1]) {
			case "+" :
				ans = first + second;
				break;
			case "-" :
				ans = first - second;
				break;
			case "*" :
				ans = first * second;
				break;
			case "/" :
				ans = first / second;
				break;
			case "%" :
				ans = first % second;
				break;
		}
		return ans;
	}
	
}
