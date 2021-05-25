package com.jacob.tests.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.jacob.calculator.Calculator;

public class CalculatorTests {
	
	@Test
	public void testCalculator() {
		Calculator c = new Calculator();
		assertEquals(3, c.add(1, 2));
	}
	
	// Failing test
	@Test
	public void testCalculator2() {
		Calculator c = new Calculator();
		assertEquals(4, c.add(1, 2));
	}
}
