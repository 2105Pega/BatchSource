package com.revature.doucette.testing;

public class Calculator {
	
	
	// Methods
	public static int calculate(String expression) {
		int result;
		if(expression.indexOf("*")!=-1) {
			String s1 = expression.substring(0,expression.indexOf("*"));
			String s2 = expression.substring(expression.indexOf("*")+1);
			result = calculate(s1) * calculate(s2);
		}else if(expression.indexOf("/") !=-1) {
			String s1 = expression.substring(0,expression.indexOf("/"));
			String s2 = expression.substring(expression.indexOf("/")+1);
			result = calculate(s1) / calculate(s2);
		}else if(expression.indexOf("%")!=-1) {
			String s1 = expression.substring(0,expression.indexOf("%"));
			String s2 = expression.substring(expression.indexOf("%")+1);
			result = calculate(s1) % calculate(s2);
		}else if(expression.indexOf("+")!=-1) {
			String s1 = expression.substring(0,expression.indexOf("+"));
			String s2 = expression.substring(expression.indexOf("+")+1);
			result = calculate(s1) + calculate(s2);
		}else if(expression.indexOf("-")!=-1) {
			String s1 = expression.substring(0,expression.indexOf("-"));
			String s2 = expression.substring(expression.indexOf("-")+1);
			result = calculate(s1) - calculate(s2);
		}else {
			result = Integer.parseInt(expression);
		}
		
		return result;
	}
	

}
