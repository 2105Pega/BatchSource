package com.revature.calculator.tests;

import org.junit.jupiter.api.*;

import com.revature.calculator.Calculator;

public class CalculatorTests {
	
	@Test
	public void addTest() {
		Calculator c = new Calculator();
		Assertions.assertEquals(15, c.calculate("8 + 7"));
	}
	
	@Test
	public void multiplyTest() {
		Calculator c = new Calculator();
		Assertions.assertEquals(27, c.calculate("9 * 3"));
	}
	
	@Test
	public void subTest() {
		Calculator c = new Calculator();
		Assertions.assertEquals(7, c.calculate("21 - 14"));
	}
	
	@Test
	public void divideTest() {
		Calculator c = new Calculator();
		Assertions.assertEquals(8, c.calculate("48 / 6"));
	}
	
	@Test
	public void modTest() {
		Calculator c = new Calculator();
		Assertions.assertEquals(2, c.calculate("14 % 6"));
	}
	
	@Test
	public void divByZeroTest() {
		Calculator c = new Calculator();
		Assertions.assertThrows(ArithmeticException.class, () -> { 
			c.calculate("5 / 0"); 
		});
	}

}
