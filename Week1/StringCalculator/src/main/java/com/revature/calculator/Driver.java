package com.revature.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter 2 element equation:");
	    
	    String equation = scan.nextLine();
	    Calculator calc = new Calculator();
	    System.out.println("The answer is: " + equation + " = " + calc.calculate(equation));
	    
	    System.out.println("Closing...");
	    scan.close();
	    System.out.println("Closed");
	    */
		Scanner accScan = new Scanner(System.in);
		
		System.out.println("Enter other owners' IDs (separated by ONE space)");
		String input = accScan.nextLine();
		String[] inputArr;
		inputArr = input.split(" ");
		Integer sum = 0;
		ArrayList<Integer> owners = new ArrayList<Integer>();
		for (String s : inputArr) {
			Integer temp = Integer.parseInt(s);
			owners.add(temp);
			sum = sum + temp;
		}
		System.out.println(owners.toString());
		System.out.println(sum);
		accScan.close();
	}

}
