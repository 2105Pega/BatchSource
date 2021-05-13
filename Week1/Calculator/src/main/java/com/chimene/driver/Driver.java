package com.chimene.driver;

import com.chimene.calculator.Calculator;

public class Driver {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.calculate("5+11/12*7"));
	}
}
