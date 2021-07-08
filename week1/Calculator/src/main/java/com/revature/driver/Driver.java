package com.revature.driver;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		 String ans= "6 * 3 - 4 * 2";
         calculate(ans);

	}//end main
	
	
	public static String calculate(String str) {
		Calculator calc = new Calculator();
		String[] d = str.split("");
		
		
		
		char operator = sb.indexOf(str);
		
		switch (operator) {

	      // performs addition between numbers
	      case '+':
	        result = calc.add(number1, number2);
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      // performs subtraction between numbers
	      case '-':
	        result = calc.Subtract(number1,number2);
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      // performs multiplication between numbers
	      case '*':
	        result = calc.multiply(number1, number2);
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	      // performs division between numbers
	      case '/':
	        result = calc.divide(number1,number2);
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;
	      
	      case '%':
		        result = calc.module(number1,number2);
		        System.out.println(number1 + " % " + number2 + " = " + result);
		        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }
	}//end calculate

}
