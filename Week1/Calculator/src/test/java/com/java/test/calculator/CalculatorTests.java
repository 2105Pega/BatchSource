package com.java.test.calculator;

import com.chimene.calculator.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTests {

	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		assertEquals(16, c.calculate("5+11"));
	}
	
	@Test
	public void testSubtract() {
		Calculator c = new Calculator();
		assertEquals(-6, c.calculate("5-11"));
	}
	
	@Test
	public void testDivide() {
		Calculator c = new Calculator();
		assertEquals(2, c.calculate("11/5"));
	}
	
	@Test
	public void testMultiply() {
		Calculator c = new Calculator();
		assertEquals(55, c.calculate("5*11"));
	}
	
	@Test
	public void testModulo() {
		Calculator c = new Calculator();
		assertEquals(1, c.calculate("11%5"));
	}
}
